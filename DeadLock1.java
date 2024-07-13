public class DeadLock1 extends Thread {
        A a = new A();
        B b = new B();

        public void m1(){
            this.start();
            a.d1(b);
        }

        @Override 
        public void run(){
            b.d2(a);
        }
        public static void main(String[] args) {
            DeadLock1 t = new DeadLock1();
            t.m1();
        }
}


class A{
    public synchronized void d1(B b){
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        
        b.last();
    }
    public synchronized void last(){
        System.out.println("A's last method");
    }
}
class B{
    public synchronized void d2(A a){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

        a.last();

    }
    public synchronized void last(){
        System.out.println("B's last method");
    }
}
