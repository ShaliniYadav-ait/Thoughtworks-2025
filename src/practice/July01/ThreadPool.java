package practice.July01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job implements Runnable{
    String name;
    Job(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + " is running "+ Thread.currentThread().getName());
    }
}

public class ThreadPool {
    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute( new Job("Job 1"));
        pool.execute( new Job("Job 2"));
        pool.execute( new Job("Job 3"));
        pool.shutdown();
    }
}
