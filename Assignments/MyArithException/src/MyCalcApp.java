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
            System.out.println("Caught invalid age exception with message - " + e.getMessage() );
        }
    }
}
