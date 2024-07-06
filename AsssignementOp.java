public class AsssignementOp {
    public static void main(String[] args) {
        // simple assignment 
        int x= 10;
        System.out.println(x);
        // chained assignment 
        int a,b,c,d;
        a = b =c =d = 20;
        System.out.println(a+"   "+b+"  "+c+" "+d); // all are assigned same value 20.


       // int a=b=c=d=20;  imvalid statement for chained assignment we cant perform chained assignment directly at the time of variable declaration.

       //COMPOUND ASSIGNMENT OPERATOR .(in the case of compound assignmnt operators internal type casting will be performed )

       int y =10;
       y += 1; // internally y have y =(int) y+1 statement occurs so we cant get error and we dont have to worry about compile time error .
       System.out.println(y);

       // +=, -= , *= , /= ,% = ,&= ,|=,^= ,>>=,<<=,>>>=,<<<=  this are various compound assignment operatorin java 




    }

}
