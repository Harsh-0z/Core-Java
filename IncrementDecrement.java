public class IncrementDecrement {
    public static void main(String ... args){
       //increment & decrement operator.
       
        int a =10;
        a++;// here 11 is ouput
        System.out.println(a);


        int b = 10;
        int c = b++;
        System.out.println(c); // here 10 is ouput becoz first value of b is printed and than ++ operators works 
        
        int d = 20;
        int e =++d;
        System.out.println(e); // here 21 is the ouput first increment so value of d will become 21

        final int f = 10;
        f++; 
        f=11;
        System.out.println(f); // CE: we cannot assign new value or increment decrement a value of final variable .
        
        
        byte g = 10;
        g =g+1;    //CE   max(int,type of a, type of b)
        System.out.println(g);

        byte h = 10;
        h = (byte)(g+1);// to solve error we do type casting 
        System.out.println(h);// output is 11.

        byte i =10;
        i++;    // internally it will perform like (byte) (i++) here .
        System.out.println(i);//output 11

        byte j = 10;
        byte k = 20;
        // byte l = j+k;  CE: saying Possible loss of precision found:int required: byte.
        byte l = (byte) (j+k); // thats a true way to right it for avoiding errors.
        System.out.println(l);

        }
    
}
