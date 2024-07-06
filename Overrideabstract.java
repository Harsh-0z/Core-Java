abstract class Overrideabstract {

    public static void main(String[] args) {
        System.out.println("demo of private access modifier in overriding ");
    }
    
    abstract void m1();
}
class Subdemo extends Overrideabstract{
    public  void m1(){
        System.out.println("child class method ");
    }
}
