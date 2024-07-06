public class Overloading6 {
    public void m1(Animal a){
        System.out.println("Animal type version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey type method ");
    }

    public static void main(String[] args) {
        Overloading6 o = new Overloading6();
        Animal a = new Animal();
        o.m1(a);
        
        
        Monkey m = new Monkey();
        o.m1(m);

        Animal a1 = new Monkey();
        o.m1(a1);
        
    }

}
class Animal{

}
class Monkey extends Animal{

}
