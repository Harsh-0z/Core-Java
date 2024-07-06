public class Iblock {

    // whenever a object is created first instance block and after that constructor will execute.
    //if we want to perform any task other than initialization of an object than we have to perform that in instance block.
   static int count =0;
   {
    count++;
   }
   
    Iblock() {
    }
    Iblock(int i){

    }
    Iblock(double d){

    }
    public static void main(String[] args) {
        Iblock i1 = new Iblock();
        Iblock i2 = new Iblock(10);
        Iblock i3 = new Iblock(10.0);

        System.out.println("no of object created :"+count);
    }



    


    
}
