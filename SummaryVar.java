import java.rmi.server.SocketSecurityException;

public class SummaryVar {
    // we can use access modifiers with the instance variable and static variable .
    // for local variable we can only use final .
    private int x = 10; //this is private type primitive instance variable.
    private static int  y = 50;// this is private type primitive static variable
    public static String z = ("Harsh"); // this is public type object  reference  static variable.
    int[] r;
    static int[] h;

    
    public static void main(String [] args){
        SummaryVar Su= new SummaryVar();
        System.out.println(Su.x); // accessing a instance variable in the main method using reference Su.
        System.out.println(SummaryVar.y); //accessing a static variable directly by ClassName.variable.
        System.out.println(y);// we can access static variable by just its var name but it is not recomanded.

        int w = 50;
        System.out.print("The value of local variable is :");
        System.out.println(w);

        // for any type of variable if we are creating an array than it follows arrray properties
        // for static and instance variable if we try to print an arrray than jvm will give null valuee example as.

        System.out.println(Su.r);
        System.out.println(Su.r[0]);// array object "r"  is not initialized thats why null pointer exception.

        System.out.println(SummaryVar.h);
        System.out.println(SummaryVar.h[0]);// same array object "h" is not initialized thats why null pointer exception.


        int[]g;
        // System.out.println(g);null pointer exception because array g is not initialized and it is also local variable and for local variable we must have to do initializtion in array case also .

        g=new int[5];
        System.out.println(g);// it will print null becoz array is initialized.
        System.out.println(g[0]);//null pointer exception because array is not assigned to any object.



        //NOTE:::: ONCE WE CREATE AN ARRAY OBJECT EVERY ELEMENT BY DEFAULT INITIALIZED WITH DEFAULT VALUES IRRESPECTIVE OF ITS VARIABLE TYPE(LOCAL,STATIC OR INSTANCE)

    }

    
}
