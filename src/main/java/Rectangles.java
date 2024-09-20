import java.util.Scanner;

class Rectangle {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("O");
            }
            System.out.println();
        }
    }

    public int calcArea() {
        return length * height;
    }

    public int calcPerimeter() {
        return 2 * (length + height);
    }

    public void scale(int factor) {
        length *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        return "Height: " + height + ", Length: " + length;
    }
}

public class Rectangles {
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