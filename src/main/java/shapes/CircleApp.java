package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Let's make a circle!");
        do {


            System.out.println("Enter a radius: ");
            double userRadius = userInput.getDouble();
            Circle circle = new Circle(userRadius);

            System.out.println("The area of your circle is: " + circle.getArea());
            System.out.println("The Circumference of your circle is: " + circle.getCircumference());

            boolean done = userInput.yesNo("Continue? (Y/N)");
            if (done) {
                System.out.println("You made " + circle);
                break;
            }
        } while (true);
    }
}
