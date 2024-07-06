public class OloadedC {
    OloadedC(){
        this(10);
        System.out.println("no arg constructor");
    }
    OloadedC(int i ){
        this(10.5);
        System.out.println("int constructor ");
    }
    OloadedC(double d ){
            System.out.println("double arg constructor");        
    }
    

    public static void main(String[] args) {
        OloadedC c = new OloadedC();
        
    }
}
