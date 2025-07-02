package July02;

@FunctionalInterface
interface Greeting{
    String sayHello();
}

interface Maths{
 int add(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        Greeting g = ()->"Happy Holidays";
        System.out.println(g.sayHello());

        Greeting g2 = () -> "Welcome back!";
        s
        Maths m = (Integer::sum);
        System.out.println(m.add(2,3));
    }
}
