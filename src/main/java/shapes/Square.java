package shapes;

public class Square extends Quadrilateral {
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
    }

    @Override
    public void setWidth(double width) {
        this.side = width;
    }
}
