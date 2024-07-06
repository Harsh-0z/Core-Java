public class Vararg {
    public static void m1(int... x){ //internallly int... x is working as 1d array so we can use here length properties.
        System.out.println("Total  parameters passed as arguments:"+x.length);

    }
    public static void main(String [] args){
        m1(10);
        m1(1,2,3);
        m1(1,2,3,4);
        m1(1,2,3,4,5);
        m1(1,2,3,4,5,6);
        m1(1,2,3,4,5,6,7);


    }
    
}
