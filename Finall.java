public class Finall {
    public static void main(String[] args) {
        
    }
    public void Property(){
        System.out.println("cash+house+car");
    }
    
    public final  void marry(){
        System.out.println("Shubhalaxmi");
    }
}
class child extends Finall{
    public void marry(){  // as we can see compiler is showing error that means we cannot override a final method of parent class

    }
}