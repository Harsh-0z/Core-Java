public class Typecastop {
    public static void main(String... args){
        //IMPLICIT TYPE CASTING
        //ALSO KN0WN AS WIDENING OR UPCASTING /
        // THERE IS NO LOSS OF INFORMATION IN THIS TYPE CASTING.

        int a = 'a';
        System.out.println(a); // interenally char is converted into int type this type of casting is IMPLICIT cast.


        //EXPLICIT TYPECAST
        //programers resposible for doing this type of casting 
        //here programer convert bigger data type values to smaller data type value thats why also known as narrrowing.
        // there may be a chance of loss of information in this type of casting 

        int x =130;
        byte b =(byte) x;
        System.out.println(b);
        // here we are trying to assign 1300 to byte type variable but bytes range is till 127 only so maybe chance to lose data .

        // for floating point numbers 

        double  y =130.456;// first it converts into round figure to 130.
        byte  c = (byte) y;
        System.out.println(c);


    }
}
