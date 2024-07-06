import java.rmi.server.SocketSecurityException;

public class FlowIf {
    public static void main(String[] args) {
        int x = 10;
        if(x==20){
            System.out.println("Hello");
        }else{
            System.out.println("hi");
        }

        boolean b = true;
        if(b== false){
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }

        boolean c = false;
        if(c ==  false){
            System.out.println("Hello");

        }
        else 
        {
            System.out.println("Hii");
        }
        
            // curley braces are optional in if else statement without curley braces we can take only statement and that statement should not be a declarative.

        if(true)
        System.out.println("Hello java");

        if(true); // also known as empty statement 

        // if(true)
        //  int x = 10 ;// herewe will get compile time error because we cannot declare anything without curley braces in if else statement .



         if(true){
            int h = 100 ; // perefectly valid because we used { } in if statement here .
         }
          
         // there is no dangling problem in java every else is mapped and matched to nearest if statement .

        if(true)
            if(true)
            System.out.println("hello");
        else // nearest if statement is above if statement that have hello printing in it .
        System.out.println("HI");
    }
}
