class StringConcat {
    public static void main(String... arg){

        // in java only overloaded operator is + becoz it work as arithmartic op for numbers & concate for strings .
        String a ="durga";
        int b=10;
        int c=20;
        int d=30;
        System.out.println(a+b+c+d);// here we get output durga102030 because at first durga & 10 both are differ type of data thats why + works as concatation operator.
        System.out.println(b+c+d+a);// here b,c,d is all same int type so + work as arithmatic operator than with durga it work as concatanation operator.
        System.out.println(b+c+a+d);// here b and c is number so output is 30durga30
        System.out.println(b+a+c+d);// here output is 10durga2030  

        // so we can say that for above cases that if print statement star̥ts with string than we dont get some and we can get some of all numbers in the case of string is present in last only.
        a=b+c+d; // incompitable type because we canot assign int to string var so error we are going to get.

        b = b+c+d; // this is possible because we can see that all are int type number.


        






    }
    
}
