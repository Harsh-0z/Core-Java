public class FinalInstance {
    int x ; // if the value of variable is varied from object to object than it is called instance variable in java.
    // for every object a separate copy of variable will be created .
    // we can only access instance variable by cvreating object of that particular claas in java

    // ----- for final instance variable compulsory we should perform initialization before constructor complition.
    // there will be 3 total case where we can declare a final instance variable.
    // we must initialize the final instance variable because jvm will not provide any default value for that so
     // we will get compile time error for that 

    // 1 . at the time of declaration.
    final int y = 50; // valid 

    // inside instance block
    final int z ;
    {
        z =65;
    }
  
    //inside a constructor .
    final int c;
        FinalInstance(){
            c = 90;
        }


    public static void main(String[] args) {
        FinalInstance f = new FinalInstance();
        f.x=70;
        System.out.println(f.x); 
        System.out.println(f.c);
        System.out.println(f.z);
        System.out.println(f.y);



    }
}