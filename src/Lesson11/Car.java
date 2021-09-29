package Lesson11;

class Car {
    //variables
    static String color;
    String engine;
    int doorCount;

    //constructor
    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    void changeDoorCount(Car c, int doorCount) {
        c.doorCount = doorCount;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V4", 2);
        Car car2 = new Car("yellow", "V6", 4);
        ct.changeDoorCount(car1, 3);
        ct.changeColor(car1, car2);
        System.out.println("Информация по первой машине:\n Цвет: " + car1.color + "\n Мотор: " + car1.engine +
                "\n Количество дверей: " + car1.doorCount);
        System.out.println("\nИнформация по второй машине:\n Цвет: " + car2.color + "\n Мотор: " + car2.engine +
                "\n Количество дверей: " + car2.doorCount);
    }
}