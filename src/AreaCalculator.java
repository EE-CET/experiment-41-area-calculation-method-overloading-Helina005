    
    import java.util.Scanner;
import java.util.Locale;

public class AreaCalculator {

    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(float length, float breadth) {
        return (double) length * breadth;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        AreaCalculator calculator = new AreaCalculator();

        double circleArea = calculator.calculateArea(radius);
        double rectangleArea = calculator.calculateArea(length, breadth);
        double triangleArea = calculator.calculateArea(base, height);

        System.out.printf(Locale.US, "%.2f\n", circleArea);
        System.out.printf(Locale.US, "%.2f\n", rectangleArea);
        System.out.printf(Locale.US, "%.2f\n", triangleArea);

        sc.close();
    }
}