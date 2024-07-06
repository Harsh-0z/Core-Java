public class Overriding1 {
    public static void main(String[] args) {
        P p = new P();
        p.marry();
        
        C c  = new C();
        c.marry();

        P p1 = new C();   // here in overriding jvm will check the run time object and here the run time object is class c type thats why it is
        p1.marry();;      // also knowns as run time polymorphism in java 
    }

}

class P{
    public void property(){
        System.out.println("ca$h+land+gold");
    }
    public void marry(){
        System.out.println("Subbalaxmi");
    }
}

class C extends P{
    public void marry(){
        System.out.println("4me");
    }
}
