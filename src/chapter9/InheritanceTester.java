package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        //Person person = new Person();
        Employee employee = new Employee();


        Rectangle rectangle = new Rectangle();
        rectangle.print(); // I am a rectangle

        Square square = new Square();
        square.print(); // I am a rectangle
        square.print("square"); // I am a rectangle


        testSquareOverride();

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender()); // Glenda is a female

    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }

}
