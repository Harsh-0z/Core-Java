public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread t1= new Thread(t);
        t1.start();
        System.out.println("main-method");
    }
}
class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("child thread");
    }
}
