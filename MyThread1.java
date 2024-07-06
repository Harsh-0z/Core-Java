public class Thread2 {
    public static void main(String[] args) {
        MyThread1 t2 = new MyThread1();
        t2.start();
    }
}


public class MyThread1 extends Thread{
    public void run(){
        System.out.println("no arg method");
    }
    public void run(int t){
        System.out.println("int arg method");
    }
}
