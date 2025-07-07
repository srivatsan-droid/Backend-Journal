package OOPS;
abstract class Shapes {
    abstract void draw();
    void common() {
        System.out.println("Common Method");
    }
}
public class ShapeAbstract {
    public static void main(String[] args) {
        Shapes obj = new Shapes() {
            @Override
            void draw() {
                System.out.println("Draw Method");
            }
        };
        obj.draw();
        obj.common();
    }
}
