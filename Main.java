import java.util.Scanner;

interface Shape {
    String dimensions();
    double perimeter();
    double area();
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String dimensions() {
        return "Base: " + base + ", Height: " + height;
    }

    public double perimeter() {
        return base + 2 * height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        Triangle triangle = new Triangle(base, height);

        System.out.println("Triangle dimensions: " + triangle.dimensions());
        System.out.println("Triangle perimeter: " + triangle.perimeter());
        System.out.println("Triangle area: " + triangle.area());

        scanner.close();
    }
}
