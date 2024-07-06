public class Bitwise {
    public static void main(String [] args ){
        // &(  AND) = Returns true if both arguments are ture
        // |( or)= Returns true if aatleast any argument is true
        // ^(XOR) = returns true iff both arguments are different else false 

        System.out.println(true & false );
        System.out.println(true ^false );
        System.out.println(true & true );

        // we can apply this operators for integral types also 
        System.out.println(4 & 5); // we get 4 as output internal there is some process is going on at binary level code 
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);

        // BITWISE COMPLEMENT OPERATOR .

        //this type of operator cannot applied to boolean.
        System.out.println(~ -111);// if signbit is 1 than it will convert into 0 and give us answer in positve and we get (n-1 ) for negative no in positive value 
        // like if we give ~-10 than it will give us 9 in ouput if we gave ~9 than we will get -10 as output because sign bit of 9 is 0 as it is positive thats why
        //its convert in 1 and we get negative value 

        //BOOLEAN COMPLIMENT OPERATOR 
        // this operator cannot be applied to integer 

        //System.out.println(!4);  // we will get compile time error as it is applicable only for boolean type.
        System.out.println(!true);//we will get false as our output 
        System.out.println(!false ); // we will get true as output 



    }
    
}
