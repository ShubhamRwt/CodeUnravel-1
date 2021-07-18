package PractiseQuestion;

public class SquareRoot {

    public static void main(String[] args) {

        float ans = squareRoot(10);

        float p = 0.1f;

        for (int i = 1; i <=2 ; i++) {   // logn + p

            while(ans * ans > 10){

                ans = ans + p;
            }

            ans = ans - p;
            p= p/10;
        }

    }

    public static float squareRoot(int n){

        int start = 0;
        int end = n;
        float ans =0;
        while(start<=end){

            int mid = start + (end - start)/2;

            if(mid*mid == n){
                return mid;
            }

            else if(mid*mid > n){

                end =mid -1;
            }

            else{
                start =mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
