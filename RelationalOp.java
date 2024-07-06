class RelationalOp {
    public static void main(String... args){
        System.out.println(10<20);
        System.out.println('a'<10);
        System.out.println('a'<'A');
        System.out.println(true<false); // relational operator we cannot apply to booolean value thats the key point here 

        String a ="Durga";
        String b ="Harsh";

        System.out.println(a<b); // we cannot use relational operators for object comparison basis.

        System.out.println(10<23<33);// listing of relational operator is not valid.

        
    }



    
}
