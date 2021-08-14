package StackandExceptions;

public class Child {

    public void fun(){

        play();
    }

    public static void play(){

        int[] ar = new int[2];

        for (int i = 0; i <=ar.length ; i++) {
            ar[i]= i;
        }
    }
}
