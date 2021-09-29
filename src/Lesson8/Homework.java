package Lesson8;

import java.sql.SQLOutput;

public class Homework {

//variables
    static int x;
    static int y;
    static int z;
    static final double pi = 3.14;
//Methods
    public static int getMultiply(int x1, int y1, int z1){
        x = x1;
        y = y1;
        z = z1;
        int result = x1*y1*z1;
        System.out.println("Rezultat umnogenia: " + result);
        return result;
    }

    public static void getDivide(int x1, int y1){
        x = x1;
        y = y1;
        System.out.println("Celoe chislo: " + x1/y1);
        System.out.println("Ostatok po modulu: " + x1%y1);

    }

    public double square(double radius){
        double formula_s = pi*radius*radius;
        System.out.println("Square = " + pi + " * " + radius + " * " + radius + " = " + formula_s);
        return formula_s;
    }

    public static double circle(double radius){
        double formula_c = 2*pi*radius;
        System.out.println("Square = " + " 2 " + " * " + pi + " * " + radius  + " = " + formula_c);
        return formula_c;
    }

    public void allInfo(double radius){
        System.out.println("square kruga: " + square(radius));
        System.out.println("circle kruga: " + square(radius));
        System.out.println("radius kruga: " + radius);
    }

    public static void main(String[] args) {

        getMultiply(1,2,3);
        getDivide(10,3);
        circle(5);
    }
}

class HomeworkTest {
    public static void main(String[] args) {
            Homework home = new Homework();
            home.getMultiply(5,6,7);
            home.getDivide(67,6);
            home.square(32.45);
            home.allInfo(2);
    }
}

