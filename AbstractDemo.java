abstract class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("This is abstract method demo program");
        
        X x = new X();
        x.sum(10, 20);
    }

    abstract void sum(int x, int y);
}

class X extends AbstractDemo {
    void sum(int x, int y) {
        System.out.println(x + y);
    }
}
