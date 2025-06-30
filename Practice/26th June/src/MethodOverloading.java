public class MethodOverloading {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        System.out.println("Default values len = "+ r.length + " width = " + r.width);
        r.setDimensions(6,8);
        System.out.println("New rectangle dimensions are len = " + r.length + " width = " + r.width);
        r.setDimensions(3);
        System.out.println("New square dimensions are len = " + r.length + " width = " + r.width);
    }
}


class Rectangle{
    int length, width;
    Rectangle(){
        this.length = 4;
        this.width = 2;
    }

    void setDimensions(int len){
        this.length = len;
        this.width = len;
    }

    void setDimensions(int len, int wid){
        this.length = len;
        this.width = wid;
    }
}