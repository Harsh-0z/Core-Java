
class Display{
    public static synchronized   void wish(String name){
        for(int i=0;i<10;i++){
            System.out.print("Good Morning");
            try {
                Thread.sleep(2000);
    
            } catch (InterruptedException e) {
                
            }
           System.out.println(name);
        }
        
    }
}
class Mythread extends Thread{
    Display d;
    String name;
    Mythread(Display d , String name){
        this.d=d;
        this.name=name;
    }
    @Override
    public void run(){
        d.wish(name);
    }
    
}
public class SyncronizedDemo1 {
    public static void main(String[] args) {
            Display d1 = new Display();
            Display d2 = new Display();
            Mythread t1 = new Mythread(d1, "DHONI");
            Mythread t2 = new Mythread(d2, "YUVRAJ");
            t1.start();
            t2.start();


    }
}
