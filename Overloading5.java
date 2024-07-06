public class Overloading5 {
    public void m1(int ... x){
        System.out.println("VAR ARG METHODS");

    }

    public void m1(int i){
        System.out.println("GENERAL METHOD ");


    }


    public static void main(String[] args) {
        Overloading5 o = new Overloading5();

        o.m1(); // var arg method 
        o.m1(10,20,30); // var arg method 
        o.m1(10); //general method  // old is gold older functionality will get first chance 
    }
}
