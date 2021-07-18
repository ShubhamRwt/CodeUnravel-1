package Recursion;

public class RecursionProblem {
    public static void main(String[] args) {

        System.out.println(fibo(4));
    }

    public static void pinc(int n){

        if(n == 0){
            return;
        }

        pinc(n-1);
        System.out.println(n);
    }

    public static int fact(int n){

        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }


    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

}

//    4! ---->   4 * 3!,    3 * 2!,  2* 1!,  1! = 1 * 0!     0! =

//    n! =   n * fact(n-1)