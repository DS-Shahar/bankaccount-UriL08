import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius for circle 1: ");
        double radius1 = scanner.nextDouble();
        Circle circle1 = new Circle(radius1);

        System.out.print("Enter radius for circle 2: ");
        double radius2 = scanner.nextDouble();
        Circle circle2 = new Circle(radius2);

        double area1 = circle1.area();
        double area2 = circle2.area();

        System.out.printf("Area of circle 1: " + area1 + ", Area of circle 2: " + area2);

        scanner.close();
    }
}