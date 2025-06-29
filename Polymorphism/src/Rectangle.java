 class Rectangle extends Shape {

    double length, width;
    Rectangle(double len, double wid){
       this.length = len;
       this.width = wid;
    }

    double calculateArea(){
        return length*width;
    }

    double calculatePerimeter(){
        return 2*(length+width);
    }

    String shape(){
            return "Rectangle";
    }

     @Override
     public String toString() {
         return "Rectangle";
     }
//    void setDimensions(double length, double width){
//        double area = calculateArea(length, width);
//        double perimeter = calculatePerimeter(length,width);
//    }
//
//    void setDimensions(double side){
//        double area = calculateArea(side, side);
//        double perimeter = calculatePerimeter(side,side);
//    }
}
