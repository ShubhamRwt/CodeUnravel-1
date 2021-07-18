package StringRecursions;

import java.util.TreeSet;

public class Permutations {

    public static void main(String[] args) {
//1,1,2,2,4,3,4,5;     -->  1,2,4,3,5  --> 1,2,3,4,5
// 2,1,4,5,3
        TreeSet<String> set = new TreeSet<>();

        permutation("", "abc");
//        permutationUnique(set, "", "abc");

//        System.out.println(set);


        //HashSet ----> no order
        //LinkedHashset----> insertion order
        //Treeset--> sorted order

        //unique ones
    }

    public static void permutation(String processed, String unprocessed){

        if (unprocessed.isEmpty()){

            if(processed.compareTo("abc")>0) {
                System.out.println(processed);
            }
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length() ; i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i);

            permutation(first + ch + second, unprocessed);
        }
    }


    public static void permutationUnique(TreeSet<String> set, String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            set.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length() ; i++) {

            String first = processed.substring(0,i);
            String second = processed.substring(i);

            permutationUnique(set, first + ch + second, unprocessed);
        }
    }




}
