package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();

        double userRadius = userInput.getDouble();
        Circle circle1 = new Circle(userRadius);

        System.out.println("The area of your circle is: " + circle1.getArea());
        System.out.println("The Circumference of your circle is: " + circle1.getCircumference());
    }
}
