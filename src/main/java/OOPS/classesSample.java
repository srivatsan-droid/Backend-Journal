package OOPS;
class Car {
    String car;
    int speed;
    String color;
    void drive() {
        System.out.println("Driving the car at a speed of : " + speed);
    }
    void displayDetails(int speed) {
        System.out.println("Car is having an Maximum " + speed + " of X Kilometers");
    }
    void printColor(String color) {
        System.out.println("Car is " + color + " which makes it so attractive amoung audience");
    }
}
class Book {
    String title;
    String author;
    int id;
    //Constructor with Parms
    public Book(String title, String author,int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }
    void printDetails(String title, String author,int id) {
        System.out.println("[" + id + "]" + " " + title + " by " + author);
    }
}
public class classesSample {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.drive();
        obj.displayDetails(12);
        obj.printColor("Red");
        Book Obj = new Book("Harry Potter" , "J.K Rowling", 1);
        Obj.printDetails("Harry Potter", "J.K Rowling", 1);
    }
}
