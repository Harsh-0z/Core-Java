class EqualityOp{
    public static void main(String... arg){
        int a =10;
        int b=10;
        
        System.out.println(10 == 20);
        System.out.println(a == b); 
        System.out.println(true == false); // we can apply == op for every primitive type also for boolean as well.
        System.out.println(true != false);// here we get output because true and false is not equal.

        // REMEMBER ONE THING EQUALITY OPERATOR IN JAVA IS USED TO REFER AND COMPARE MEMORY ADDRESS FOR OBJECT NOT THE content for content we have 
        //.equals() method available in java 

        String s1 = new String("Harsh");
        String s2 = s1;
        String s3 = new String("Harsh");
        System.out.println(s1 == s3);// here we get false because == compares the memory reference address.
        System.out.println(s1==s2);// here we get true answer because both refer to same object.
        System.out.println(s1.equals(s3));// we will get true here as output because it checks content not the memory address..


        //if we apply equality operators for object types then compulsory there should be some relation between argumentd type.
        // means better we use equality operators for same class type only or between parent child class or child to parent class .
        // Example as 

        Threa2 t1=new Threa2();
        Object o = new Object();
        String str = new String("Hello");

        System.out.println(t1 == o);
        System.out.println(str == o);
        System.out.println(str == t1); // se here we dont have any relation between string & thread class so we will get Exception of incompitable operand types string and thread. 
        // so make sure we should atleast aware about that which class is part of which class .



    }
}