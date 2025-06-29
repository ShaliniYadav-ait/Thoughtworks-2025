 class Triangle extends Shape{

    double s1,s2,s3;
    Triangle(double s1,double s2,double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    double calculateArea(){
        double s = (s1+s2+s3)/2;
        return  Math.sqrt(s*(s-s1)*(s-s2)*(s-s2));
    }

    double calculatePerimeter(){
        return s1+s2+s3 ;
    }

     @Override
     public String shape() {
         return "Triangle";
     }
}
