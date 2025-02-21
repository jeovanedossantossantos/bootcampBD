public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        GeometricForm circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea());

        GeometricForm square = new Square(5);
        System.out.println("Square area: " + square.getArea());

        GeometricForm rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.getArea());

    }
}
