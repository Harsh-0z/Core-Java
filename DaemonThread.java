public class DaemonThread {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.setDaemon(true);
        t.start();

        System.out.println("Hello boss this is durga");
    }
}


class Mythread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            System.out.println("child thread");

        }
    }
}
