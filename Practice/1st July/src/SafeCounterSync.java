public class SafeCounterSync implements Runnable{

    static int count = 0;
    public synchronized static void increment(){
        count++;
    }
@Override
    public void run(){
        for (int i = 0; i < 100000; i++){
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new SafeCounterSync());
        Thread t2 = new Thread(new SafeCounterSync());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Current counter is "+ count);
    }
}
