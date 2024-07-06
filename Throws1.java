public class Throws1 {
    public static void main(String...args) throws InterruptedException{
        doStuff();
    }
    public static void doStuff() throws InterruptedException{
        doMoreStuff();
    }
    public static void doMoreStuff()throws InterruptedException{
        Threa2.sleep(10000);
    }
    
}
