package StringRecursions;

public class Subsequence {

    public static void main(String[] args) {
//        subsquence("abc", "");

        System.out.println(subsequenceCount("", "abc"));
    }


    public static void subsquence(String unprocessed, String processed) {

        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subsquence(unprocessed, processed + ch);
        subsquence(unprocessed, processed);

    }

    public static int subsequenceCount(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return 1;
        }

        int cnt =0;

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        cnt += subsequenceCount(processed+ch, unprocessed);
        cnt += subsequenceCount(processed, unprocessed);

        return cnt;
    }

}
