package practice.July01;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterAtomic  implements Runnable{
    static AtomicInteger count = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0 ; i < 10000000; i++){
            count.incrementAndGet();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(new SafeCounterAtomic());
        Thread t2 = new Thread(new SafeCounterAtomic());
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter is done!" + count) ;
    }




}
