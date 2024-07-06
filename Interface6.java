interface A{
    public void m1();  // if any two interfacees have same name methods with same signature with same method type than we can implement
}                      // only one method for both interfaces in same class and both will implemented but we can implemented both at once 
                        // if we want to implement both as seperate than we can implement other in separate class .
interface B{
    public void m1();
}



public class Interface6 implements A,B {
    public static void main(String[] args) {
        
    }   
    public void m1(){
        System.out.println("Both a and b interfaces method has been implemented ");
    }
}
