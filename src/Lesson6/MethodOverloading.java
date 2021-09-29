package Lesson6;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }

    void show(String s, int a) {
        System.out.println("String : " + s + " int : " + a);
    }

    void show(int a, String s) {
        System.out.println("Kakoy xoroshiy den");
    }
}
class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        boolean b = true;
        String s = "Ivan";
        mO.show(a);
        mO.show(b);
        mO.show(s);
        mO.show("Privet",10);
        mO.show(12,"Privet");
    }
}
