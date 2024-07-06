public class FinalLocal {
    // localvariable is also known as temporary variable 
    // anywhere we use local variable we must intialize it before using it jvm wont give default value for that .
    public static void main(String... args){
        final int x = 1000;  // the only applicable modifier for local variable is final .
         
        // x = 111;
        System.out.println(x);
// if formal parameters declared as final then within the method we cant do reassignment .
    }

}
