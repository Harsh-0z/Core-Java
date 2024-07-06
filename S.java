public class S {
    //1====if the value of a var is not varied from object to obj than its not recomanded to declare a var as instance var 
    //such var we have to declare as static var
    //2== for static var a single copy will be created at class lvl.

    static int x= 10 ;
    public static void main(String[] args) {
        S v = new S();
        System.out.println(v.x); // not recomanded .
        System.out.println(S.x);//printing it with class into static var name
        System.out.println(x);// printing with just its variable name 
        

    }
    
}
