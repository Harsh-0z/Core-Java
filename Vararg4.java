public class Vararg4{
    public static void main(String...args){
        int[]a={10,30,50};
        int[]b={90,99,35};
        m(a,b);


    }
    public static void m(int[]...x){ // we can use array in var arg methods.
        for(int[] x1:x){
            System.out.println(x1[2]);
    
        }
    }
}