

public class InterruptedDemo2 {
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
        for(int i=0 ;i< 10000 ;i++){
            System.out.println(" lazy thread");
        }
        System.out.println("i need sleep");
        try {
            for(int j =0;j<10;j++){
                System.out.println("lazy thread 2");
                Thread.sleep(2000);

            }
            
        } catch (InterruptedException e) {
            System.out.println("i got inturrupted");
        }
    }
}