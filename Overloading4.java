
public class Overloading4 {
    public void m1(int i ,float f ){
        System.out.println("int-float method ");

    }

    public void m1(float f , int i ){
        System.out.println("Float-int method");
    }

    public static void main(String [] args){
        Overloading4 o = new Overloading4();

        //o.m1(10,10); this will give ambiguous problem .
        //o.m1(10.5f,10.5f); // this approacch will give compile time eroor because second 10.5f is not able to convert into int type 
        
        o.m1(10, 10.5f);// int float method is the output here 
        o.m1(10.5f,10);// float int method is the output here .
        
    }
}
