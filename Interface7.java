// method naming conflict in interface java .

interface A{
    public void m1();
}

interface B{
    public int m1();
}
// we can implement any no of interface with a java class expect this case (if the method have doifferent return type )

public class Interface7 {
    public static void main(String[] args) {
        
    }
    public int m1(){
        return 0 ;
    }
    public void m1(){
                          // impossible to implement this type of method in same class or in child class 
    }
}
