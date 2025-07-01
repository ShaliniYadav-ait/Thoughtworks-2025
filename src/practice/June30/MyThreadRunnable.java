package practice.June30;

class MyThreadRunnable implements Runnable {
 public void run(){
     for (int km = 0; km < 50; km++){
         System.out.println(Thread.currentThread().getName());
     }
 }
}

class MainClassRunnable{
    public static void main(String[] args){
        MyThreadRunnable th1 = new MyThreadRunnable();
        Thread t1 = new Thread(th1);
        t1.start();
    }
}