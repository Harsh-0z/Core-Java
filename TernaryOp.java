public class TernaryOp {
    public static void main(String[] args) {
        //TERNARY CONDITIONAL OPERATOR (?:)

        // only possible ternary operator in java
        // we can perform nesting of conditional operations also .

        int x = (10<20)? 30:40;
        System.out.println(x);
   
        int y =(10>20)?30:((40>50)?60:70);  
        System.out.println(y);
   
    }


}
