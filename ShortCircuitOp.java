public class ShortCircuitOp {
    // same as BITWISE OPERATOR but thing is that it is used to check to condition at a time but faster than nor,al bitwise operators in some conditon.

    public static void main(String[] args){
        int x=10;
        int y =15;
        if(++x < y && ++y>15){ // so here both conditon is not true thats why we get false as output at the runtime first statement is evaluates
            // after that compiler check wheather the first conditon is true or not if true than go for second statement otherwise not going for second statement
            //so its time saver sometimes we dont need to waste time for second condition checking so thats benefit we are getting 
            System.out.println("false ");

        }
        else{
            System.out.println("true ");
        }

        if(++x<10 && (x/0>10)){
            System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }

        
    }
}
