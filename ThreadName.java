class ThreadN extends Thread {
    
}

public class ThreadName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("jsn");
        ThreadN n = new ThreadN();
        n.start();
        n.setName("harsh");
        System.out.println(n.getName());

        // System.out.println(10/0);
    }
    
}
