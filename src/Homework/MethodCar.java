package Homework;

public class MethodCar {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed+=skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed-=skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("cvet: " + color + "  motor: " + engine + "  skorost: " + speed);

    }
}

class MethodCarTest {
    public static void main(String[] args) {
        MethodCar met = new MethodCar();
        met.color = "white";
        met.engine = "V6";
        met.speed = 60;

        met.showInfo();
        met.gaz(30);
        met.showInfo();
        met.tormoz(90);
        met.showInfo();
    }
}
