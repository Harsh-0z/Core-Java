class InstanceOf{
   static InstanceOf x = new InstanceOf();
    public static void main(String[] args){
       
        if(x instanceof InstanceOf){
            System.out.println("x is object of class test");
        }else{
            System.out.println("x is not a part of class Test");
        }

        // how to use instancve of operator 

        Threa2 t = new Threa2();
        System.out.println(t instanceof Threa2);// t is part of thread so output is true 
        System.out.println(t instanceof Object);// Object is parent class where as thread is child class so it true 
        System.out.println(t instanceof Runnable);// Runnable is parent(class) interface of Thread class so this thing also returns true as well 

        String s = new String("HELLO");

        // System.out.println(t instanceof String); 
        // we will get compile time error because t and String dont have any relationship .
        //InstanceOf.java:20: error: incompatible types: Thread cannot be converted to String
        // to use instancve of operator there should be some relationship between argument types either child to parent, parent to child or sametype


        //NOTE: for any class or interface x null instanceof X is always false .

        System.out.println(null instanceof Threa2);




    }
}

