class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Circle 1 Radius: " + c1.radius);
        System.out.println("Circle 2 Radius: " + c2.radius);
    }
}
