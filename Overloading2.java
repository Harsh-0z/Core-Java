public class Overloading2 {
    public void m1(String s){
        System.out.println("String - arg version");

    }
    public void m1(Object o){
        System.out.println("Obj arg version");
        
    }

    public static void main(String[] args) {
        Overloading2 o = new Overloading2();
        o.m1("Dugra "); // String arg version 
        o.m1(new Object()); // obj version 
        o.m1(null); // String version collector office example by durga sir 
    }
}
