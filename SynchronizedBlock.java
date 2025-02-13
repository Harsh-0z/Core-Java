public class SynchronizedBlock {
    public static void main(String[] args) {
        Display d = new Display();
        

        Mythread t = new Mythread(d,"Dhoni");
        Mythread t1 = new Mythread(d,"Yuvraj");
        Mythread t2 = new Mythread(d,"Kholi");
        t.start();
        t1.start();
        t2.start();


    }
}

class Display{
    public void wish(String name){
        
        //System.out.println("synchronized demo java");
        synchronized(this){
            for(int i=0;i<=10;i++){
                System.out.print("Good morning");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
    
                }
                System.out.println(name);
            }
        }
        
    }
}

class Mythread extends Thread{
    Display d;
    String name;

    Mythread(Display d ,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run(){
        d.wish(name);
    }

}
