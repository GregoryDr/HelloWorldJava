package Lesson7;

public class Employee {
    public double salary;

    public void dvoynayaZP(){
       double result = salary*2;
       System.out.println("Novaya ZP = " + result);
    }
    public Employee(double salary2){

        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(23.43);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}


