package Lesson7_1;

import Lesson6.Employee;

public class EmployeeTestAccess {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petrov", 500.67);
        System.out.println(emp1.surname + " " + emp1.id);
        emp1.met1();
        emp1.met2();
        emp1.met3();

        /*Employee emp2 = new Employee(1, "Voronov",32, 43.56, "IT");
        System.out.println(emp2.surname);*/
    }
}
