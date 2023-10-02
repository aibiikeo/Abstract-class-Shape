import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter figure name: ");
            String figure = input.nextLine();

            if (figure.equals("rectangle")) {
                System.out.println("Enter width: ");
                double width = input.nextDouble();
                System.out.println("Enter length: ");
                double length = input.nextDouble();
                rectangle r = new rectangle(figure, width, length);
                System.out.println("Perimeter: " + r.getPerimeter());
                System.out.println("Area: " + r.getArea());
            } else if (figure.equals("circle")) {
                System.out.println("Enter radius: ");
                double radius = input.nextDouble();
                circle c = new circle(figure, radius);
                System.out.println("Perimeter: " + c.getPerimeter());
                System.out.println("Area: " + c.getArea());
            } else if (figure.equals("triangle")) {
                System.out.println("Enter side1: ");
                double side1 = input.nextDouble();
                System.out.println("Enter side2: ");
                double side2 = input.nextDouble();
                System.out.println("Enter side3: ");
                double side3 = input.nextDouble();
                triangle t = new triangle(figure, side1, side2, side3);
                System.out.println("Perimeter: " + t.getPerimeter());
                System.out.println("Area: " + t.getArea());
            } else if (figure.equals("square")) {
                System.out.println("Enter length: ");
                double length = input.nextDouble();
                square s = new square(figure, length);
                System.out.println("Perimeter: " + s.getPerimeter());
                System.out.println("Area: " + s.getArea());
            }
            else if (figure.equals("exit")) {
                break;
            }
            else {
                System.out.println("Incorrect figure name!");
            }
            input.nextLine();

        }
    }
}