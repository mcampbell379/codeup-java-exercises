package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape1;
        Measurable myShape2;

        myShape1 = new Square(4);
        myShape2 = new Rectangle(4,5);

        System.out.println(myShape1.getArea());
        System.out.println(myShape2.getArea());

        System.out.println();

        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape2.getPerimeter());
    }
}
