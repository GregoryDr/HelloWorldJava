package Homework;

public class Human {
    String name;
    Car3 car;
    BankAccountNew bA;

    void info(){
        System.out.println("Imya: "+ name + "  cvet mashiny: " + car.color + "  Balance bankovskogo scheta: " + bA.balance);
    }

}

class HumanTest{

    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "v6");
        h.bA = new BankAccountNew(18, 200.5);
        h.info();

    }
}

class Car3 {
    Car3(String c, String e) {
    color = c;
    engine = e;
    }
    String color;
    String engine;
}

class BankAccountNew {
    BankAccountNew(int id2, double balance2){
    id = id2;
    balance = balance2;
    }
    int id;
    double balance;
}
