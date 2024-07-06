
public class Overloading1 {
    public void m1(int i){
        System.out.println("int- arg method");
    }
    public void m1(float f ){
        System.out.println("float- arg method ");
    }
    public static void main(String ... args){
        Overloading1 x =new Overloading1();
        x.m1(10);//int-arg method
        x.m1(10.5f);// float arg method  
        x.m1('a'); // ijnt arg method 
        x.m1(10l);// int argt method 



        // x.m1(10.5); invalid we will get compile time error for this 
    }
}
