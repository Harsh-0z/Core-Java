public class Methodhide {
    public static void main(String[] args) {
       
        // P.m1();          // Output: "Parent main"
        // c.m1();          // Output: "Child main"
        P p = new c();
        p.m1();          // Output: "Parent main"
    }
}

class P {
    
    public static void m1() {
        System.out.println("Parent main");
    }
}

class c extends P {
    
    public static void m1() {
        System.out.println("Child main");
    }
}


