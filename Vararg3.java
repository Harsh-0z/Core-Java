public class Vararg3 {

    public static void m1(int...x){ // var arg method
        System.out.println("var arg method ");
        
    }
    public static void m1(int x){// general method
        System.out.println("generaL method");
    }

    public static void main(String[] args){
        m1();//return var arg method
        m1(50);// return general method
        m1(50,60);// return vararg method becoz we can pass multiple parameters in var arg methods
        
    }
}
