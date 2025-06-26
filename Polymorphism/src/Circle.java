import java.io.CharArrayReader;

public class Circle {

    Circle(){
        calculateArea(2);
        calculatePerimeter(2);
    }

    double calculateArea(double r){
        return  Math.PI * r * r;
    }

    double calculatePerimeter(double r){
        return  2 * Math.PI * r;
    }
}
