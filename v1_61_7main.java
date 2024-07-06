public abstract class v1_61_7main {
   
    public static void main(String[] args){
        System.out.println("Main method");

    }
    static {   // static block executed first not problem its written anywhere in the program.
        System.out.println("Static block");
        System.exit(0); // if we use exit than it will shutdown the jvm and cannot procceed further to main method.
    }


}
