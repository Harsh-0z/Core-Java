public class Join2{
    public static void main(String[] args)throws InterruptedException {
        Mythread.mt=Thread.currentThread();
        Mythread t = new Mythread();
        t.start();
        t.join();
        for(int i=0 ;i<10;i++){
            System.out.println("main Thread");
            Thread.sleep(2000);
        }
    }
}


class Mythread extends Thread{
    static Thread mt;

    @Override
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread ");
        }
    }
}