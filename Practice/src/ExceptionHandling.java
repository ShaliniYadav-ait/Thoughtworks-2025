
public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Start");
        testException();
        testMultiException();
        System.out.println("End");
    }

    private static void testException() {
        try {
            System.out.println(100/0);
        }
        catch (ArithmeticException e){
            System.out.println("Single Exception in the code is  " + e);
        }
    }

    private static void testMultiException() {
        try {
            int nums[] = {10,20,30};
            System.out.println(nums[2] / 0);
            try {
                System.out.println("Inner block");
                System.out.println(100 / 0);
            }
            catch (ArithmeticException e){
                System.out.println("Exception for inner block  code is  " + e);
                System.out.println(20/0);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Exception in the code is  " + e);
        }
    }
}

