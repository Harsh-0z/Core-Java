public class localvar {

    public static void main(String [] args){
        int i = 0; // make sure we must declare local variable with initialization other wise we found error because jvm will not provide any default value to local variable 
        // scope of local variable is as same as methods or constructors or block when it declared once block,constructor,method will execute than local var is also executed .
        //local variable is thread safe .
        // in logical blocks we must declare firsr local  variable than we can use it .
        for(int j=0;j<5;j++){
            i=i+j;
            System.out.println(i);
        }
    
    }
}