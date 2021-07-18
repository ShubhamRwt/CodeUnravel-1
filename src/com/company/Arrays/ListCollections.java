package com.company.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ListCollections {

    public static void main(String[] args) {

//        int[] ar = new int[10];

        // int, float etc are primitives, Collections don't work upon these. They work on Wrapper Classes

        int i = 3;

        Integer a = i;
        // Iterable
        // Collection Interface is the parent or you can say something from where all the collection utilities ar being derived

        // ArrayList and Vector are both resizable arrays but ArrayList is faster
        // Vector is synchronised hence slow
        // ArrayList doesn't double its size, It gets increased by 50%

       // newsize = old + old >> 1

        // Vector double its size

//        0100--> 4
//        0010 --> 2

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(i);
        list.add(6);

        System.out.println(list.get(0));
        list.set(1,3);
        list.size();
        list.contains(3);
        list.indexOf(3);


        Vector<Integer> vector = new Vector<>();

        System.out.println(list);

    }
}

//How resiszing is done in Vector and ArrayList

//       list     object ---> 10(no reference on this)
//          |           (it will get Garbage collected)
//          |
//          -------> object--->15