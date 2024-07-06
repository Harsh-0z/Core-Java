interface A {
    void m1(); // No need to explicitly mention abstract and public, as they are implicit
}

interface B {
    void m1(int i);
}

class Interface8 implements A, B { // Corrected class name to start with uppercase
    public static void main(String[] args) {
        System.out.println("The method naming conflict example in Java ");
        
        Interface8 i = new Interface8();
        i.m1();
        i.m1(10); // You can also call the overloaded method with an int parameter
    }

    public void m1() {
        System.out.println("Hello");
    }

    public void m1(int i) {
        System.out.println("int hello: " + i);
    }
}
