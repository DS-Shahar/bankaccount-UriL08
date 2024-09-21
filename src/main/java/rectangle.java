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
