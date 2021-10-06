package Lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("o",2));
        System.out.println(sb2.substring(5));
        System.out.println(sb2.substring(5,8));

        System.out.println(sb2.subSequence(5,9));

        sb2.append(22);
        System.out.println(sb2);

        System.out.println(sb2.insert(4,'|'));

        StringBuilder s10 = new StringBuilder("Hello World");
        System.out.println(s10.delete(3, 6));
        System.out.println(s10);
        System.out.println(s10.deleteCharAt(7));
        System.out.println(s10.reverse());

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0,5,"Pete");
        System.out.println(sb12);
        System.out.println(sb12.capacity());





    }

}
