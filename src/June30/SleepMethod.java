package June30;

public class SleepMethod  implements Runnable{
    public void run(){

        try{
            for (int i = 0; i < 10; i++){
                System.out.println(" *** " + i);
            }
            Thread.sleep(5000);
            System.out.println("Waiting for 5 sec!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThreadSleep{

    public static void main(String[] args){
        SleepMethod s = new SleepMethod();
        Thread sleepThread = new Thread(s);
        sleepThread.start();
    }
}