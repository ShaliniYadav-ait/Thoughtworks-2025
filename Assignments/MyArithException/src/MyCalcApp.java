class MyArithException extends RuntimeException{
    public  MyArithException(String message){
        super(message);
    }
}

class Calculator {
    double caldouble(int n) throws MyArithException{
            if (n < 0) {
                throw new MyArithException("Age cannot be negative.");
            } else if (n == 0) {
                throw new MyArithException("Age cannot be zero.");
            }
        double newN = (double) n;
        System.out.println("New value of n is " + newN);
        return (newN);
    }
}

public class MyCalcApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        callException(c,-1);
        callException(c,0);
        callException(c,2);
    }

    private static void callException(Calculator c, int n) {
        try {
            c.caldouble(n);
        }catch (MyArithException e){
            System.out.println("Invalid age " + e.getMessage() );
        }
    }
}
