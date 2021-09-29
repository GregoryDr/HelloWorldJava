package Lesson12;

public class Test11 {
    void abc() {
        String str;
        int a = 5;
        if (a >= 10) {
            str = "Privet";
        }
        if (a < 10) {
            str = "Poka";
        } else {
            str = "?????????";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a : b;//Ternary operator
        System.out.println(maximum);
    }
}
