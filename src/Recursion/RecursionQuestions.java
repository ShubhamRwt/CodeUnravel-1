package Recursion;

public class RecursionQuestions {

    public static void main(String[] args) {

//        dice("", 4);

//        System.out.println(dicecount("", 4));
//        System.out.println(mazepathcount(3,3));
        numpad("", "19");
    }

    public static void dice(String processed, int target){

        if(target == 0){
            System.out.println(processed);
                return;
        }

            for (int i = 1; i <=6 && i<=target ; i++) {

                    dice(processed + i, target-i);
        }
    }

    public static int dicecount(String processed, int target){

        if(target == 0){
            System.out.println(processed);
            return 1;
        }

        int cnt =0;

        for (int i = 1; i <=6 && i<=target ; i++) {

           cnt += dicecount(processed + i, target-i);
        }

        return cnt;
    }

    public static void mazepath(String processed, int row, int col){

        if(row==1 && col==1){
            System.out.println(processed);
            return;
        }

        if(row>1){
            mazepath(processed+"V",row-1,col);
        }

        if(col>1){
            mazepath(processed+"H", row, col-1);
        }
    }

    public static int mazepathcount(int row, int col){

        if(row==1 || col==1){
            return 1;
        }

        return mazepathcount( row-1, col) + mazepathcount(row, col-1);
    }

    public static void numpad(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int number = unprocessed.charAt(0)-'0';
        unprocessed = unprocessed.substring(1);

        for (int i = 3*(number-1); i < 3 * number ; i++) {

            if(i==26){
                continue;
            }

            numpad(processed + (char)(i+'a'), unprocessed);
        }
    }
}
