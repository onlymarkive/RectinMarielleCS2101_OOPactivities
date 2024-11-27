package Shapes;

public class Main {
    public static void main(String[] args) {
        // Create instances of shapes
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(8, 12);
        Triangle triangle = new Triangle(10, 12, 15);

        // Collection of shapes
        Shape[] shapes = { square, rectangle, triangle };

        // Create a ShapeCollection instance
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        // Compute and print the area and perimeter for each shape
        shapeCollection.getPropertyValues();
    }
}
