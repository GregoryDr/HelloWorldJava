package Lesson10.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;
import static Lesson10.p1.p2.B.*;


public class D {
//class B
    public static void test () {
        int x;
        String y;
        x = chislo;
        y = name;
        System.out.println(x + y);
    }
//class A
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.b);

        test();//class B

//class C
        C c1 = new C();
        System.out.println(c1.name + c1.surname);

//class E
        E e1 = new E("Pedro", 99);
        System.out.println(e1);
    }



}
