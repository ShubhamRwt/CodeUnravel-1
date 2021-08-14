package OOps.ClassesAndObject;

public class Human {

    int hands =  2;

    int bankBalance= 1000;

    public void fun(){

        System.out.println("hello");
    }

    public void speak(){
        System.out.println("Speak");
        receipt();
    }

    public static void receipt(){
        System.out.println("Hello World");
    }

    public void loan(){
        bankBalance = bankBalance - 1000;
    }
}

