package Lesson18;

public class HomeNestedForArray {

    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];//0
            int index = i;//0
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];//-9,0
                    index = j;//3,
                }
            }
            if (i != index) {//0 != 3
                a = array[i];//a == array[0]
                array[i] = min;//array[0] == -9
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, -9, 0, 6, 45};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
