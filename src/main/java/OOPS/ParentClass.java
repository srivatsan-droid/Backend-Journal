package OOPS;
class Parent {
    int a = 10;
    void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    int b = 20;
    void show() {
        System.out.println("Child show");
    }
}
public class ParentClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        Parent obj1 = new Child();
        obj1.show();
    }
}
