package shapes;

public class Circle {
    private static int circleCounter;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        circleCounter++;
    }

    public static int getCircleCounter() {
        return circleCounter;
    }

    // accessors
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.getRadius();
    }
}
