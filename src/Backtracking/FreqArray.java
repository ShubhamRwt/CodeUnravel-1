package Backtracking;

public class FreqArray {

    public static void main(String[] args) {

        String s ="bac";
        int[] freq = freqArray(s);
        lexoPermute("", freq, s.length(), s);
    }

    private static void lexoPermute(String processed, int[] freq, int length, String s) {

        if(processed.length() == length && processed.compareTo(s)>0){

            System.out.println(processed);
            return;
        }

        for (int i = 0; i < freq.length; i++) {

            if(freq[i]>0){
                freq[i]--;
                lexoPermute(processed + (char)('a'+i), freq, length, s);
                freq[i]++;
            }
        }
    }

    public static int[] freqArray(String s){

        int[] freq = new int[26];

        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        return freq;
    }
}
