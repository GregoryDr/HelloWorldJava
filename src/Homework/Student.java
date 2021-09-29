package Homework;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    // Оценки по 10-ти бальной шкале
    double mathAverageGrade;
    double economicaAverageGrade;
    double foreightLanguageAverageGrade;

    Student(int studentId1, String name1, String surname1, int course1, double mathAverageGrade1,
            double economicaAverageGrade1, double foreightLanguageAverageGrade1 ){
        studentId = studentId1;
        name = name1;
        surname = surname1;
        course = course1;
        mathAverageGrade = mathAverageGrade1;
        economicaAverageGrade = economicaAverageGrade1;
        foreightLanguageAverageGrade = foreightLanguageAverageGrade1;

    }

    Student(int studentId2, String name2, String surname2, int course2){
        this(studentId2, name2, surname2, course2, 0.0, 0.0, 0.0);
    }

    Student(){
        this(0, null, null, 0, 0.0, 0.0, 0.0);
        System.out.println("Ne prinal znacheniy !");
    }
}

class StudentTest {

    double sredArifmOcenka(Student st){
        double sredOcenka = (st.mathAverageGrade + st.economicaAverageGrade + st.foreightLanguageAverageGrade)/3;
        System.out.println("Srednaya Arifmeticheskaya Ocenka Studenta: " + st.name + " " + st.surname + " = " + sredOcenka );
        return sredOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Ivan";
        st1.surname = "Ivanov";
        st1.course = 1;
        st1.mathAverageGrade = 10.1;
        st1.economicaAverageGrade = 32.32;
        st1.foreightLanguageAverageGrade = 23.45;

        Student st2 = new Student(1, "Petr", "Drozdov", 4);
        st2.mathAverageGrade = 33.1;
        st2.economicaAverageGrade = 32.32;
        st2.foreightLanguageAverageGrade = 78.45;

        Student st3 = new Student(2, "Ivan", "Ivanchenko", 2, 23.4,
                43.5, 3.5);


    StudentTest Tests = new StudentTest();
    Tests.sredArifmOcenka(st1);
    Tests.sredArifmOcenka(st2);
    Tests.sredArifmOcenka(st3);

    }
}
