package Lesson19;

public class forEach {
    public static void main(String[] args) {
        int array[] = {0, 4, 6, 1};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
