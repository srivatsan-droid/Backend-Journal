package OOPS;
class Animal {
    String name;
    void eat() {
        System.out.println(name + " " + "is Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println(name + " " + "is Barking");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";
        d.eat();
        d.bark();
    }
}
