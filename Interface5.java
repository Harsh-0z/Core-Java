// variable name conflicts 
interface A{
    int x = 777;
}
interface B {
    int x = 888;
}
public class Interface5 {
    public static void main(String[] args) {
        System.out.println(A.x);
        System.out.println(B.x);
        
    }
}
