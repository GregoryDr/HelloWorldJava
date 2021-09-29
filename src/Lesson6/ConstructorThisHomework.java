package Lesson6;

public class ConstructorThisHomework {
    int sum() {
        int result = 0;
        System.out.println("Summa vsex chisel: " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Summa vsex chisel: " + result1);
        return result1;
    }

    int sum(int a, int b) {
        int result2 = a+b;
        System.out.println("Summa vsex chisel: " + result2);
        return result2;
    }

    int sum(int a, int b, int c) {
        int result3 = a+b+c;
        System.out.println("Summa vsex chisel: " + result3);
        return result3;
    }

    int sum(int a, int b, int c, int d) {
        int result4 = a+b+c+d;
        System.out.println("Summa vsex chisel: " + result4);
        return result4;
    }

    int sum(int a, int b, int c, int d, int e){
        int result5 = a+b+c+d+e;
        System.out.println("Summa vsex chisel: " + result5);
        return result5;
    }
}

 class ConstructorThisHomeworkTest{
     public static void main(String[] args) {
         ConstructorThisHomework cons = new ConstructorThisHomework();

         int x = cons.sum();

         int x1 = cons.sum(1);

         int x2 = cons.sum(1,2);

         int x3 = cons.sum(1,2,5);

         int x4 = cons.sum(1,2,7,8);

         int x5 = cons.sum(1,2,8,8,8);
     }
 }