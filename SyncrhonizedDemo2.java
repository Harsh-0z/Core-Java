public class SyncrhonizedDemo2 {
    public static void main(String[] args) {
        Display d1 = new Display();
       // Display d2= new Display();

        Mythread t = new Mythread(d1);
        Mythread1 t1 = new Mythread1(d1);
        t.start();
        t1.start();

    }
}

class Display {
    public synchronized  void displayn(){
        for(int i=0;i<10;i++){
            System.out.print(i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){

            }
        }
    }
    public synchronized void displayc(){
        for(int i=65;i<=75;i++){
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                
            }
        }
    }
}

class Mythread extends Thread{
    Display d;

    Mythread(Display d){
        this.d=d;

    }
    @Override
    public void run(){
        d.displayn();
    }
}
class Mythread1 extends Thread{
    Display d;

    Mythread1(Display d){
        this.d=d;

    }
    @Override
    public void run(){
        d.displayc();
    }
}