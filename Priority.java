public class Priority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        MyThread3 t = new MyThread3();
        t.setPriority(10);
        t.start();
        
        for(int i =0;i<10;i++){
            System.out.println("main thread ");
        }
        
    }
}

class MyThread3 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
}
