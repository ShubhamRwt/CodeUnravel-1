package com.company.Arrays.Strings;

import java.io.BufferedReader;
import java.io.File;
import java.nio.Buffer;
import java.util.Scanner;

public class StringsIntro {

    //  in C++, String ius array of characters.
    // In Java, String is a class.

    // EveryTime you create a string, a new object is created everytime

    String s = "hello"+"ji";

    public static void main(String[] args) {

        String s = "hello";    //  ->  String Literal

//        String s1= new String("hello");

        String s1 = new String("hello");

        Scanner scn = new Scanner(System.in);

        StringBuilder builder= new StringBuilder(s); // not synchronised

        StringBuffer buffer = new StringBuffer(s);  // synchronised


        String str = scn.nextLine();
        int a = scn.nextInt();

        File f  = new File("");

//        char ch = scn.next().charAt(0);
//        input character
        //Dont use nextInt and nextLine together

        System.out.println(s1.length());
        System.out.println(s1.stripLeading());
        System.out.println(s1.charAt(0));
        System.out.println(s.equals(s1));
    }
}
