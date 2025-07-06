package OOPS;

class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void printDetails() {
        System.out.println("Student with ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }

    public void checkPass() {
        if (marks > 40) {
            System.out.println(name + " Passed!");
        } else {
            System.out.println(name + " Failed!");
        }
    }
}

class Mobile {
    String brand;
    int price;

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void showInfo() {
        System.out.println(brand + " Price is " + price);
    }
}

public class ClassesExcercise {
    public static void main(String[] args) {
        Student s1 = new Student(2, "John", 40);
        Student s2 = new Student(3, "Jack", 78);
        Student s3 = new Student(4, "Jason", 34);

        s1.printDetails(); s1.checkPass();
        s2.printDetails(); s2.checkPass();
        s3.printDetails(); s3.checkPass();

        Mobile m1 = new Mobile("Samsung", 45000);
        m1.showInfo();
    }
}
