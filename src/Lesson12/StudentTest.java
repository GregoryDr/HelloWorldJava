package Lesson12;

import Lesson11.*;

public class StudentTest {

    public static void sravnenie(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Информация о студентах совпадает!");
        } else {
            System.out.println("Первый метод: " + "\nИнформация о студентах не совпадает!");
        }
    }

    public static void nestedIf(Student s1, Student s2) {

        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Имена студентов, курсы и оценки совпадают!");
                } else {
                    System.out.println("Совпадает только имя и курс");
                }
            } else {
                System.out.println("Совпадение только по имени");
            }
        } else {
            System.out.println("Имена студентов различаются!");
        }
    }
}

class Test {
    public static void main(String[] args) {
        StudentTest test = new StudentTest();
        Student st1 = new Student("Ivan", 2, 4.7);
        Student st2 = new Student("Ivan", 2, 3.7);
        test.sravnenie(st1, st2);
        System.out.println();
        test.nestedIf(st1, st2);


    }
}
