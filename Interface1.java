interface A{
    void sum();
    void div();
}
class Interface1 implements A{
    public static void main(String[] args) {
    Interface1 i = new Interface1();
    i.sum();
    i.div();
    }
    public void sum(){
        System.out.println("This is the demo example for interface 1");
    }
    public void div(){
        System.out.println("This is the demo for div method from interface A ");
    

    }

}
