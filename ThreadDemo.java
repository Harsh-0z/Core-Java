public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        System.out.println("main thread");
    }
    
}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("child thread");
    }

}
