public class JoinT {
    public static void main(String[] args)throws InterruptedException {
        Mt t = new Mt();
        t.start();
        t.join();

        for(int i = 0; i<10;i++){
            System.out.println("main thread");
        }

    }
}
class Mt extends  Thread {
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println( "child thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }
    }

}