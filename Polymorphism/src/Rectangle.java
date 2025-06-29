 class Rectangle extends Shape {

    double length, width;
    Rectangle(double len, double wid){
      setDimensions(len,wid);
    }

    double calculateArea(){
        return length*width;
    }

    double calculatePerimeter(){
        return 2*(length+width);
    }

    String shape() {
        if (length == width){
            return "Square";
         }
         return "Rectangle";
     }

    void setDimensions(double length, double width){
        this.length = length;
        this.width = width;
    }

    void setDimensions(double side){
        this.length = side;
        this.width = side;
    }
}
