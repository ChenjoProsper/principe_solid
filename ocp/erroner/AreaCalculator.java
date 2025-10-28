package ocp.erroner;

public class AreaCalculator {
    public double calculateArea(Object shape){
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        }
        throw new IllegalArgumentException("Unknown shape type");
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        double circleArea = calculator.calculateArea(new Circle(5));
        double rectangleArea = calculator.calculateArea(new Rectangle(4, 6));
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}