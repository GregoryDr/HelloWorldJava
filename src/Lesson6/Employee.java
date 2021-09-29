package Lesson6;

public class Employee {
//Constructors
    Employee(int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    Employee(String surname3, int age3){

        this (0, surname3, age3, 0.0, null);
    }

    public Employee(String surname5, double salary5){
        this (0, surname5, 0, salary5, null);
    }

//variables
    public int id;
    public  String surname;
    int age;
    private double salary;
    String department;
//Methods
    public void met1(){
        System.out.println("Familiya: " + surname + " " + "Zarplata: " + salary);
    }
    public void met2(){
        System.out.println("Familiya: " + surname);
    }
    public void met3(){
        System.out.println("Familiya: " + surname + " " + "ID: " + id);
    }
}
 class EmployeeTest {
     public static void main(String[] args) {
         Employee emp1 = new Employee("Petrov", 500.67);
         System.out.println(emp1.surname + " " + emp1.id);
         emp1.met1();
         emp1.met2();
         emp1.met3();

         Employee emp2 = new Employee(1, "Voronov",32, 43.56, "IT");
         System.out.println(emp2.surname);



     }
 }