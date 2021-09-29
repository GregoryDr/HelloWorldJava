package Homework;

public class Method {

    int summa(int a, int b, int c) {

        int result = a + b + c;
        return result;
    }

    int sredneeArifm (int a1, int b1, int c1){
        int result1 = summa(a1,b1,c1)/3;
        return result1;

    }
}

class MethodTest {

    public static void main(String[] args) {

        Method t = new Method();
        int summaTrexChisel = t.summa(1,2,3);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(1,2,3));

        System.out.println(t.sredneeArifm(34,45,23));

    }

}