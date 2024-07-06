public class Yield {
    public static void main(String... args){
        
        
        Mt t = new Mt();
        //t.setPriority(10); all the things depend to the thread schedulars and jvm but yield works but its unpredictable.
        t.start();
        

        for(int i=0;i<=10;i++){
            System.out.println("main thread");
        }



    }
}
class Mt extends Thread{
    @Override
    public void run(){
        for(int i =0;i<=10;i++){
            System.out.println("child method ");
            Thread.yield();
        }
    }
}