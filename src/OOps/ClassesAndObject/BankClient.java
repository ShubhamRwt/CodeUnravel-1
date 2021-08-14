package OOps.ClassesAndObject;

public class BankClient {

    public static void main(String[] args) {

        Bank ICICI = new Bank(50000, "David");

        System.out.println(ICICI.bankbalance);
        System.out.println(ICICI.user);

    }
}
