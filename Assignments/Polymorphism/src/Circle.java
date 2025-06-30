class Circle extends Shape{

    double radius;
    Circle(double r){
       this.radius = r;
    }

    double calculateArea(){
        return  Math.PI * radius * radius;
    }

    double calculatePerimeter(){
        return  2 * Math.PI * radius;
    }

  public String shape() {
        return "Circle";
    }

 }
