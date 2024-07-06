public class Instancevar {
    //value of var is varied from object to object than its called instance variable 
    // for every object a separate copy of variable will be created 
    //instance variable should be declared within the class directly but not in method,blocks or constructors 
    //same scope as object
    
    
    int x=10;
    double d;// if we are not assigning anything to instance variable than jvm will print its default value as shown below.
    boolean b ;
    String s;
    public static void main(String[] args) {
        //System.out.println(x);not accessavle in static area directly without creating object.
        Instancevar i = new Instancevar();
        System.out.println(i.x); //output =10 
        System.out.println(i.d);// default value
        System.out.println(i.b);//default value
        System.out.println(i.s);//default value

    }
    public void m(){
        System.out.println(x);//accessible inside the method because itis non static area .
    }

    
    




}
