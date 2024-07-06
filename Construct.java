public class Construct {
    public static void main(String[] args) {
    //    P p = new P();
    //    System.out.println(p.hashCode()); 

       C c = new C();
       System.out.println(c.hashCode());
    }
}

class P{
    P(){
        System.out.println(this.hashCode());
    }
}
class C extends P{
    C(){
        System.out.println(this.hashCode());
    }
}