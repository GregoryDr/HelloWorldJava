package Lesson9;

public class Car {
//variables
    int a = 10;
    String color;
    String engine;
    static int count;
//constructors
    public Car(String color, String engine){

        int x = 5;
        int y = x+10;
        this.count++;
        this.color = color;
        this.engine = engine;
    }
//methods
    public static void changeA(int b){
        Car c = new Car("black", "V8");
        c.a = b;

    }

    public void showColor(){
        System.out.println("Цвет машины: " + color);
        changeColor("red");
    }

    public void changeColor(String color3){
        int cena = 5000;
        color = color3;
        cena+=1000;
        System.out.println("Цвет машины: " + color);
    }

    public static void main(String[] args) {
        Car c = new Car("black", "V8");
        System.out.println(c.color);
        c.changeColor("red");
    }
}
