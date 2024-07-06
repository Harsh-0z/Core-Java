public class FinalStatic {
    // if the value of the variable is not varied from object to object than such type of variable is known as Static var.
    // for this type of variable one single class level copy will be created .

    // We must initialize the final static variable with some value because jvm wont provide any default value for that .

    // rule : -- before class loading completion we must initialize the final static variable.

    //1 . At the time of declaration .

    final static int x = 90;

    // 2. inside static block.

    final static int y ;
    static
    {
        y =100;
    }

    public static void main(String[] args) {
       System.out.println(x); 
       System.out.println(y);
      
    }
    
}
