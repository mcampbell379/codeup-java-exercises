package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    //accessors
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
