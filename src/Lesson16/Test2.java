package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefabcd");

        String s10 = s1.substring(3);
        System.out.println(s10);
        System.out.println(s1);

        String s11 = s1.substring(3,7);
        System.out.println(s11);

        String s12 = s1.trim();//delete space
        System.out.println(s12);

        String s2 = new String("privet");

        String s13 = s2.replace('r','Z');
        System.out.println(s13);
        System.out.println(s2);//immutable String statement

        String s14 = s2.replace("vet","vivka");
        System.out.println(s14);

        String s15 = "privet,";
        String s16 = "drug";
        System.out.println(s15.concat(s16));

    }
}
