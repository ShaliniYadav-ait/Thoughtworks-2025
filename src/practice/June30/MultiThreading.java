package practice.June30;

public class MultiThreading {
  public static void main(String[] args){
      MyThread firstThread = new MyThread();
      MyThread secondThread = new MyThread();
      firstThread.start();
      firstThread.setName("First");
      secondThread.start();
      secondThread.setName("Second");
      MyThread thirdThread = new MyThread("Shalini");
      thirdThread.start();
      for (int dis = 0; dis < 50; dis++) {
          System.out.println("In Main. " + dis);
      }
  }
}

class MyThread extends Thread{
    MyThread(){

    }
    String threadName;
    MyThread(String name){
        this.threadName = name;
    }

    public void run(){
        for (int distance = 0; distance < 50; distance++) {
            System.out.println("Here! " + distance + " " + this.threadName + " ** " + Thread.currentThread().getName());
        }
    }
}