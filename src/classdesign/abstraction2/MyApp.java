package classdesign.abstraction2;

public class MyApp {
    public static void main(String[] args) {
        Circle circle=new Circle("Circle",5);
        System.out.println(circle.getArea());

        Square square=new Square("Square", 4,4);
        System.out.println(square.getArea());

        Triangle triangle=new Triangle("Triangle", 5,4);
        System.out.println(triangle.getArea());

        circle.draw();
        triangle.draw();
        square.draw();

    }
}
