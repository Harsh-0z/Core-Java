interface A {
    void sum();
    void div();
}


public abstract class Interface2 implements A{
    public static void main(String[] args) {
        
    }
    public void sum(){
        System.out.println("This is demo implementation of sum method from interface A ");
    }
    
}
class SubInterface2 extends Interface2{
    public static void main(String[] args) {
        SubInterface2 i = new SubInterface2();
        i.div();
    }
    public void div(){
        System.out.println("This is the demo for div implementation from interface A into sub class of interface after declaring interface1 as abstract");
    }
}
