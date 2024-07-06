public class p1 {
    public static void main(String[] args){
        System.out.println("Parent method");
    }
    
}
class c1 extends p1{
    public static void main(String[] args){  // method hiding 
        System.out.println("Child method");
    }
}
