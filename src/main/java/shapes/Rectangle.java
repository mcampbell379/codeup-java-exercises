package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double setLength(double length) {
        return length;
    }

    @Override
    public double setWidth(double width) {
        return width;
    }
}
