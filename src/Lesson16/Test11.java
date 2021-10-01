package Lesson16;

public class Test11 {
    public static void main(String[] args) {
        String s1 = "privet";
        System.out.println(s1.isBlank());//false

        String s2 = "      ";
        System.out.println(s2.isBlank());//true

        String s3 = " ";
        System.out.println(s3.isEmpty());

        String s4 = "   Hi          ";
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());
        System.out.println(s4.stripTrailing());

    }
}
