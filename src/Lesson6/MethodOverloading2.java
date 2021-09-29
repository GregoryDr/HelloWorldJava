package Lesson6;

public class MethodOverloading2 {
    int sum (int i1, int i2){
        return i1+i2;
    }

    String sum (String st1, String st2){
        return st1+st2;

    }
}

class MethodOverloading2Test{
    public static void main(String[] arga){
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(5,7);
        System.out.println(a);

        String s = mO2.sum("Privet," + " ", "Ivan");
        System.out.println(s);
    }
}
