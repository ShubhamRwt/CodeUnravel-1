package Recursion;

public class RecursionArray {

    public static void main(String[] args) {

        int[] ar = {1,4,5,10,19};
        int idx = 0;

        pattern( 4, 0);
//        System.out.println(isSorted(ar,0));
//        System.out.println(linear(ar, 0, 5));
    }

    public static int linear(int[] ar, int idx, int element){

        if(idx == ar.length){
            return -1;
        }

        if(ar[idx] == element){
            return idx;
        }

        return linear(ar,idx+1, element);
    }

    //     1, 2, 3

    public static boolean isSorted(int[] ar, int idx){

        if(idx == ar.length-1){
            return true;
        }

        if(ar[idx] >ar[idx+1]){
            return false;
        }

        return isSorted(ar, idx +1 );
    }

    public static void pattern(int row, int col){

        if(row == 0){
            return;
        }

        if(col == row){
            pattern(row - 1, 0);
            System.out.println();
        } else {
            pattern(row, col + 1);
            System.out.print("*");
        }
    }
}


