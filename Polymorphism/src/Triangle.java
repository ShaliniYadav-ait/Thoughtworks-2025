public class Triangle {

    Triangle(){
    calculateArea(2,2);
    calculatePerimeter(2,2,2);
    }

    int calculateArea(int h, int b){
        return (h*b)/2;
    }

    int calculatePerimeter(int a, int b, int c){
        return (a+b+c);
    }
}
