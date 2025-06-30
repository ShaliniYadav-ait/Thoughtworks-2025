public class MultiThreading {
  public static void main(String[] args){
      MyThread firstThread = new MyThread();
      MyThread secondThread = new MyThread();

      firstThread.start();
      secondThread.start();
      // Normal method execution
//      firstThread.run();
//      secondThread.run();
//      firstThread.show();
//      secondThread.show();
  }
}

class MyThread extends Thread{
//    void show(){
    public void run(){
        for (int distance = 0; distance < 50; distance++) {
            System.out.println("Here! " + distance);
        }
    }
}
