package OOps.ClassesAndObject;

public class Bank {

    int bankbalance;
    String user;


    public Bank(){
        this(400000);
    }

    // this point to the instance variable of the same class????

    public Bank(int bankbalance){
        this(bankbalance, "default");
    }

    public Bank(int bankbalance, String user){

        this.bankbalance = bankbalance;
        this.user= user;
    }

    public void withdraw(){
        System.out.println("Mere paise legya");
    }

    public void deposit(){
        System.out.println("jama kar be");
    }
}
