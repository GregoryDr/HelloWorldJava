package Lesson15;

public class Test8 {
    public static void main(String[] args) {
        int chas = 0;

        OUTER:
        do {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                if (minuta == 20){
                    break OUTER;
                }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas++;
        }

        while (chas<24);
    }
}
