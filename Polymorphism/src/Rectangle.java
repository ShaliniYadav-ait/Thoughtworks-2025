public class Rectangle {

    Rectangle(){
        calculateArea(2,2);
        calculatePerimeter(2,2);
    }

    double calculateArea(double l, double w){
        return l*w;
    }

    double calculatePerimeter(double l , double w){
        return 2*(l+w);
    }

    void setDimensions(double length, double width){
        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length,width);
    }

    void setDimensions(double side){
        double area = calculateArea(side, side);
        double perimeter = calculatePerimeter(side,side);
    }
}
