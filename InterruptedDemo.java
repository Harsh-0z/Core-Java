public class InterruptedDemo {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();

        System.out.println("end of main thread");

    }
}

class Mythread extends Thread{
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("lazy thread");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Inturrupted");
        }
    }

}
