import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Calculating the shape : ");
        Shape c = new Circle(3);
        Shape t = new Triangle(3,3,3);
        Shape r = new Rectangle(3,3);
        ArrayList<Shape> shapes= new ArrayList<>();
        shapes.add(c);
        shapes.add(t);
        shapes.add(r);
        for (Shape type: shapes){
            System.out.println("Shape is : "+  type.shape());
            System.out.println("Area is : " + type.calculateArea());
            System.out.println("Perimeter is : " + type.calculatePerimeter());
            System.out.println(" **************************");
        }

    }
}