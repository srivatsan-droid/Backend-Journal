package OOPS;
abstract class Animal1 {
    void sound() {
        System.out.println("Animal Sound");
    }

    abstract void Sound();
}
class Dog1 extends Animal1 {
    @Override
    void Sound() {
        System.out.println("Dog Sound");
    }
}
public class DogClasses {
    public static void main(String[] args) {
        Dog1 obj = new Dog1();
        obj.Sound();
    }
}
