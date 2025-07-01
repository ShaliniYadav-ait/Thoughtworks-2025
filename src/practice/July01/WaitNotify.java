package practice.July01;

public class WaitNotify {
    public static void main(String[] args){
        Signal signal = new Signal();
        Thread manavThread = new Thread(signal::waitForVishal);

        Thread vishalThread = new Thread(() -> {
            try { Thread.sleep(1000);} catch (InterruptedException ignored){}
            signal.notifyManav();
        });
        manavThread.start();
        vishalThread.start();
    }
}

class Signal{
    synchronized void waitForVishal(){
        System.out.println("Manav : Waiting for Vishal's message....");
        try{
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Manav : Got the message! Lets start work.");
    }

    synchronized void notifyManav(){
        System.out.println("Vishal sending signal to Manav...");
        notify();
    }
}