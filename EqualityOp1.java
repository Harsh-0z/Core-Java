public class EqualityOp1 {
    public static void main(String[] args){
        // we can aplly equality operators for every single primitive type including boolean as well .
        int a =10;
        int b =20;
        
        System.out.println(10 == 20);
        System.out.println(a == b);
        System.out.println('a'==b);
        System.out.println(false == false);
         
        // we can apply equality operators for object reference also.

        EqualityOp1 e1 = new EqualityOp1();
        EqualityOp1 e2 = new EqualityOp1();

        EqualityOp1 e3 = new EqualityOp1();

         e3 = e1;

         System.out.println(e3 == e1); 

         // we can aplly equality operators for different object type but there should be relation between those object types like
         // either child to parent or parent to child or same type 

         Threa2 T = new Threa2();
         Object o = new Object();
        String str = new String();

        System.out.println(T == o); // here thread is child class whereas object is parent class so some relation is there 
        System.out.println(o == str); // here string is child class where as object is parent class so some relation is there 
       // System.out.println(str == T);  incomparable type string & thread this type of error we get becoz no relation between both classes .


        // Difference between == operator and equals method .

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println( s1 == s2); // it checkes memory reference so output we will get is false .
        System.out.println(s1.equals(s2)); // it checks content in it so we can say that it will return true because s1 and s2 both hacve same content .
         

        // null == null is always true for equality operators .

        String s3 = new String("Durga");
        System.out.println(s3 == null);// we get false because s3 have durga value and we are comparing it with null .

        String s4 = null;
        System.out.println(s4 == null);// here we will get true because null == null is always true for object type.




  
        
    }
}
