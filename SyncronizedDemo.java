
class Display{
    public synchronized  void wish(String name){
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
public class SyncronizedDemo {
    public static void main(String[] args) {
            Display d = new Display();
            Mythread t1 = new Mythread(d, "DHONI");
            Mythread t2 = new Mythread(d, "YUVRAJ");
            Mythread t3 = new Mythread(d, "KOHLI");
            t1.start();
            t2.start();
            t3.start();


    }
}
