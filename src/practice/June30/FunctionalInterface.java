package practice.June30;

@java.lang.FunctionalInterface
interface Functional {
    int find(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Functional addition = (x, y) -> x + y;
        Functional substraction = (x, y) -> x - y;
        Functional multiply = (x, y) -> x * y;

        System.out.println("Addition is " + addition.find(3,4));
        System.out.println("Substraction is " + substraction.find(6,2));
        System.out.println("Multiplication is " + multiply.find(7,7));
    }
}
