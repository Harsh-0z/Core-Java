public class Overloading3{
    public void m1(String s){
        System.out.println("String version");
    }
    public void m1(StringBuffer sb){
        System.out.println("String buffer version ");
    }

    public static void main(String[] args) {
        Overloading3 o = new Overloading3();

        // o.m1(null); ambiguos problem here compile time error

        o.m1("durga");
        o.m1(new StringBuffer("Durga"));
    }
}
