package shapes;

public class Circle {
    private double radius;
    private static int circleCounter;

    public Circle(double radius) {
        this.radius = radius;
        circleCounter++;
    }

    // accessors
    public double getRadius() {
        return radius;
    }

    public static int getCircleCounter() {
        return circleCounter;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.getRadius();
    }
}
