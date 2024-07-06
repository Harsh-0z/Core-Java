public class Overridevararg {
public static void main(String[] args) {
    P p = new P();
    p.m1(10);

    C c = new C();
    c.m1(10,20,30);

    P p1 = new C();
    p1.m1(12,15,189);
}
}


class P{
    public  void m1(int ...x){
        System.out.println("Parent method ");
    }
}
class C extends P{
    public void m1(int... x){
        System.out.println("child method");
    }
}
