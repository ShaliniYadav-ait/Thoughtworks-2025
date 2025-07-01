package practice.June26;

public class ConstructorTypes {
    public static void main(String[] args) {
        Len defaultLen = new Len();
        System.out.println("Default length is "+ defaultLen.length);
        Len customLen = new Len(5);
        System.out.println("Customized length is " + customLen.length);
    }
}

class Len{
    int length;
    // Default Constructor
    Len(){
        this.length = 8;
    }

    //Parameterized constructor
    Len(int len){
        this.length = len;
    }
}