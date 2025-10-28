package ocp.solution;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(5, 10);
        AreaCalculator2 calculator = new AreaCalculator2();
        double area = calculator.calculateArea(shape);
        System.out.println("Area: " + area);
    }
}
