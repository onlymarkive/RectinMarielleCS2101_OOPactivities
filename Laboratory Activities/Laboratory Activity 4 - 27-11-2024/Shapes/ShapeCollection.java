package Shapes;

public class ShapeCollection {
    private Shape[] shapes;

    // Constructor to initialize the shapes array
    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    // Method to print the area and perimeter of each shape
    public void getPropertyValues() {
        for (Shape shape : shapes) {
            shape.printShapeType();
            System.out.println("Area: " + String.format("%.2f", shape.getArea()));
            System.out.println("Perimeter: " + String.format("%.2f", shape.getPerimeter()));
            System.out.println();
        }
    }
}
