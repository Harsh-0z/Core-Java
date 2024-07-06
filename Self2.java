import java.util.Scanner;



public class Self2 {
    public static void main(String[] args){
        multiplication(10,20,30,40,50,60);
        // here the multiplication result will exceed the range of long data type thats why its shows here output in minus and that limit excedding 
        // we can say as long data overflow in arithmatic operation.

   
    }
   
    

public static void multiplication(long... a){
    if(a.length <1){
        System.out.println("Not a single element found to multiply");
    }
    long n =a[0];
    for(int i=1;i<a.length;i++){
        n = n*a [i];
    }
    System.out.println(n);
}
}
