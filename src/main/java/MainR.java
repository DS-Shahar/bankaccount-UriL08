import java.util.Scanner;
public class MainR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length and height for rectangle 1:");
        int length1 = scanner.nextInt();
        int height1 = scanner.nextInt();
        Rectangle rect1 = new Rectangle(length1, height1);

        System.out.println("Enter length and height for rectangle 2:");
        int length2 = scanner.nextInt();
        int height2 = scanner.nextInt();
        Rectangle rect2 = new Rectangle(length2, height2);

        System.out.println("Drawing rectangle 1:");
        rect1.draw();
        System.out.println("Drawing rectangle 2:");
        rect2.draw();

        rect1.scale(2);
        System.out.println("Rectangle 1 after scaling by 2: " + rect1);

        int totalArea = rect1.calcArea() + rect2.calcArea();
        int totalPerimeter = rect1.calcPerimeter() + rect2.calcPerimeter();

        System.out.println("Sum of areas: " + totalArea);
        System.out.println("Sum of perimeters: " + totalPerimeter);

        scanner.close();
    }
}