class MyThreads extends Thread{
    public void start(){
        super.start();
        System.out.println("start method overloaded ");
    }

    public void run(){
        System.out.println("child method");
    }

}


public class MainThread2 {
    public static void main(String[] args) {
        MyThreads tt = new MyThreads();
        tt.start();
        System.out.println("main method ");
    }
}
