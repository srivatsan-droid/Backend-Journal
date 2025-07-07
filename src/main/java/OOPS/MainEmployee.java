package OOPS;
abstract class Employee1 {
    int id;
    String name;
    double salary;
    Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //Abstract method to be implemented by child classes
    abstract void calculateSalary();
    void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Developer extends Employee1 {
    double hourlyRate = 1000;
    int hoursWorked = 40;
    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }
    void calculateSalary() {
        double totalSalary = hourlyRate * hoursWorked;
        System.out.println("Developer salary is: " + totalSalary);
    }
}
class Manager1 extends Employee1 {
    double bonus = 5000;

    Manager1(int id, String name, double salary) {
        super(id, name, salary);
    }

    void calculateSalary() {
        double totalSalary = super.salary + bonus;
        System.out.println("Manager salary is: " + totalSalary);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee1 obj = new Developer(1, "John", 5000);
        obj.calculateSalary();
        obj.showDetails();
        Employee1 obj2 = new Manager1(2, "Jane", 6000);
        obj2.calculateSalary();
        obj2.showDetails();
    }
}
