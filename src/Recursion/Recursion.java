package Recursion;

public class Recursion {
//Breaking a complex problem into simple unit s and then solving it

//               6!/5*6, 5!/ 5             5*4!, 5*4*3!, 5*4*3*2!, 5*4*3*2*1!
                                              // (recursion)

    public static void main(String[] args) {
        pdec(4);
    }

//    public static void p4(){
//
//        System.out.println("4");
//        p3();
//        System.out.println("4");
//    }
//
//    public static void p3(){
//        System.out.println("3");
//        p2();
//        System.out.println("3");
//    }
//
//    public static void p2(){
//        System.out.println("2");
//        p1();
//        System.out.println("2");
//
//    }
//
//    public static void p1(){
//        System.out.println("1");
//        p0();
//    }
//
//    public static void p0(){
//        return;
//    }


    public static void pdec(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);    // 4 3 2 1
        pdec(n-1);
    }


}




//   1,2,3,4     4,3,2,1
//

//   1
//   2
//   3
//   4