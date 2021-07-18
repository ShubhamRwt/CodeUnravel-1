package Recursion;

public class SomeMoreRecursionQues {

    //Staircase problem

    // you will try

    public static void main(String[] args) {
//        String str ="abbcaba";
//        System.out.println(longestPallinseq(str, 0, str.length()-1));

//        System.out.println(LCS("adbcbra", "abcr"));

        System.out.println(EditDistance("geseks", "gesek"));
    }

    public static int longestPallinseq(String str, int start, int end){

        if(start>end) {
            return 0;
        }

        if(start == end) {
            return 1;
        }

        if(str.charAt(start) == str.charAt(end)) {
            return 2 + longestPallinseq(str, start+1, end -1);
        } else {
            return Math.max(longestPallinseq(str, start+1, end), longestPallinseq(str, start, end-1));
        }
    }

    //

    public static int LCS(String str1, String str2){

        if(str1.length()==0 || str2.length()==0){
            return 0;
        }

        char first = str1.charAt(0);
        char second = str2.charAt(0);

        if(first == second){
           return  1 + LCS(str1.substring(1), str2.substring(1));
        } else{
            return Math.max(LCS(str1.substring(1),str2), LCS(str1, str2.substring(1)));
        }
    }

    public static int EditDistance(String str1, String str2){

        if(str1.length()==0){
            return str2.length();
        }

        if(str2.length()==0){
            return str1.length();
        }

        char first = str1.charAt(0);
        char second = str2.charAt(0);

        if(first == second){
            return EditDistance(str1.substring(1), str2.substring(1));
        } else{
            return 1+ Math.min(EditDistance(str1.substring(1), str2),
                    Math.min(EditDistance(str1.substring(1), str2.substring(1)),
                    EditDistance(str1, str2.substring(1))));
        }
    }
}
