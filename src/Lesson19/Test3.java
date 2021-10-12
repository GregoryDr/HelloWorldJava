package Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int array[] = {0, 4, 6, 1};
//        for (int i = 0; i < array.length; i++) {
//            array[3] = 3;
//        }
        for (int a : array) {
            a = 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        String[] array1 = {"privet", "poka", "ok"};
        for (String s : array1) {
            s = new String("hello");
        }

        System.out.println();

        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + " ");
        }
    }
}
