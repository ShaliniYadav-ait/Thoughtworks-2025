import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Calculating the shape : ");
        ArrayList<Shape> shapes = shapeList();
        displayShapes(shapes);
        rectangleToSquare();
    }

    private static void rectangleToSquare() {
        Rectangle s = new Rectangle(3,4);
        s.setDimensions(4);
        System.out.println("Shape is : "+  s.shape());
        System.out.println("Area is : " + s.calculateArea());
        System.out.println("Perimeter is : " + s.calculatePerimeter());
        System.out.println(" **************************");
    }

    private static void displayShapes(ArrayList<Shape> shapes) {
        for (Shape type: shapes){
            System.out.println("Shape is : "+  type.shape());
            System.out.println("Area is : " + type.calculateArea());
            System.out.println("Perimeter is : " + type.calculatePerimeter());
            System.out.println(" **************************");
        }
    }

    private static ArrayList<Shape> shapeList() {
        Shape r = new Rectangle(3,4);
        Shape c = new Circle(3);
        Shape t = new Triangle(3,3,3);
        ArrayList<Shape> shapes= new ArrayList<>();
        shapes.add(r);
        shapes.add(c);
        shapes.add(t);
        return shapes;
    }
}