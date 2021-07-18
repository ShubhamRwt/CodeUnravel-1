package MultiDimensional;

public class MultiIntro {

    //2d array

    //    int ar[3][3]
    //   1 2 3
    //   4 4 4      --> Block struture in C or C++
    //   5 5 5

    //  4 4 4 4
    //  1 3             ----> Block structure or you can get a jagged array
    //  8 5 7 8 15

    // int ar[2][3]

     //         ar[0]  ------> new int[3]
    //          ar[1]  ------> new int[3]

    //  for Block struture  -->  int [][]  ar = new int[2][3]

    // for jagged array  -->  int[]  ar = new int[2]
    //                        int ar[0] = new int[5]
    //                        int ar[1] = new int[3]
    public static void main(String[] args) {

//     --> 4
//        int[][] arcustom ={{1,2,3},      4>3     i = i + 1
//                           {4,5,6},    4 < 6     j = j-1
 //                          {7,8,9}};   ----->  n+n  = 2n
////                  //  Important question
//                   ----> n^2
//
//        printWave(arcustom);
//
//        int [][] ar = new int[4][2];
//
//        for (int i = 0; i <ar.length ; i++) {
//            for (int j = 0; j < ar[i].length ; j++) {
//
//                System.out.println(ar[i][j]);
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//
        int [][] ar1 = new int[4][];

        ar1[0] = new int[6];
        ar1[1] =new int[5];
        ar1[2] = new int [3];
        ar1[3] = new int[2];


        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j < ar1[i].length ; j++) {

                System.out.print(ar1[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 3,3   ---> last index (2,2)
    //   0,0  0,1  0,2
    //   1,0  1,1  1,2
    //   2,0  2,1  2,2

     // 1  2  3
    //  4  5  6
   //   7  8  9    --->    //  123 654 789

    public static void printWave(int[][] ar){

        for (int i = 0; i <ar.length ; i++) {

            if(i%2==0){
                for (int j = 0; j <ar.length ; j++) {
                    System.out.println(ar[i][j]);
                }
            }
            else{

                for (int j = ar.length-1; j>=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }

}
