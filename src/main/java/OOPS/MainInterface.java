package OOPS;
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
public class MainInterface {
    public static void main(String[] args) {
        Drawable obj = new Circle();
        obj.draw();
    }
}
