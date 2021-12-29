package chapter11;

public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5,7);
        rectangle.print(); // I am a shape
        System.out.println(rectangle.calculateArea()); // 35.0


    }
}
