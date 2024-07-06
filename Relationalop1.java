public class Test{
     // summary : relational operators we cant apply to object types 
     //2.listing of realtional operators is invalid 
     //3.operator < canm=not be applied to boolean , int at a same time .
     //4 . this realtional operator we can aplly  to only on primitive data types except boolean.
    public static void main(String[]  args){
        int a = 10 ;
        int b = 20 ;
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println('a'>50);
        System.out.println('a'>'A');
        System.out.println('true'<'false');

        String str = new String("Hello");
        String str1= new String("hi");

        System.out.println(str>str1); // bad operand type for binary operators  we cant apply object types to relatinonal operators.

        System.out.println(10<20<30); // relation operators cannot allowed listing .

        System.out.println(true<30); // operator < cannot be applied to boolean,int.


    }
}