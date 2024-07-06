class Overriding2{
    public static void main(String[] args) {
            P p = new P();
            p.m1();

            C c = new C();
            c.m1();
    }
}

class P{
    public Object m1(){
        return null;
    }
}
 // in overriding child class have covarient type of parent class return type in java 
 // here parent class has Object as return type where as Child class has String as return type so its valid in java 
 //because its covarient of object type here 
class C {
    public String m1(){
        return null;
    }
}