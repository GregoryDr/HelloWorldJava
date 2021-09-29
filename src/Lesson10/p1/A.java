package Lesson10.p1;

public class A {
    public String b = "Vova";

   public A(){
        this.b = b;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.b);
    }

}
