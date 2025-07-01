package practice.July01;

public class NoThreadSafe implements Runnable{

    static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new NoThreadSafe());
        Thread t2 = new Thread(new NoThreadSafe());

        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch (InterruptedException e){}

        System.out.println("Counter is " + counter);
    }
        @Override
    public void run() {
            for (int i = 0; i < 100000; i++){
                counter++;
            }
    }
}
