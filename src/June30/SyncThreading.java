package June30;

class Camera{
    synchronized void click(){
        // or use synchronized(this) to synchronize specific code block
        System.out.println("Entered -- " + Thread.currentThread().getName());
        for (int click  = 1; click < 25; click++){
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("Exited -- " + Thread.currentThread().getName());
    }

}

class Bachu extends Thread{
    Camera camera;
    Bachu(Camera camera){
        this.camera = camera;
    }

    @Override
    public void run(){
        camera.click();
    }
}

class Nirwani extends Thread{
    Camera camera;
    Nirwani(Camera camera){
        this.camera = camera;
    }

    @Override
    public void run(){
        camera.click();
    }
}

class SyncThreading {
    public static void main(String[] args){
        Camera c = new Camera();
        Bachu b = new Bachu(c);
        Nirwani n = new Nirwani(c);
        b.setName("Rashmi");
        n.setName("Swati");
        b.start();
        n.start();
    }
}
