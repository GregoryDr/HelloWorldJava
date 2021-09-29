package Homework;

public class BankAccount {

    int id = 10;
    String name = "Petr";
    double balance = 100;

    void popolnenieCheta(double summaPopolneniya) {
        System.out.println("Balans do popolneniya: " + balance);
        System.out.println("Balans popolnen na: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans posle popolneniya: " + balance);
        System.out.println();
    }

    void sniyatieSoSheta(double summaSniyatia) {
        System.out.println("Balans do popolneniya: " + balance);
        System.out.println("Balans umenshilsa na: " + summaSniyatia);
        balance -= summaSniyatia;
        System.out.println("Balans posle snatiya: " + balance);
        System.out.println();
    }


    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();

        MyAccount.popolnenieCheta(32.43);
        MyAccount.sniyatieSoSheta(54.67);

    }
}
