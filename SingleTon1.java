
// THIS IS THE SECOND WAY TO CREAte THE SINGLETON CLASS AND IT IS GOOD ENOUGH EVEN IF WE DO NOT CREATE ANY OBJECT .

public class SingleTon1 {
    private static SingleTon1 s = null;

    private SingleTon1(){

    }

    

    public static SingleTon1 gSingleTon1(){
        if(s == null){
            s = new SingleTon1();
        }
        return s;
    }

    public static void main(String...args){
        SingleTon1 s1 = SingleTon1.gSingleTon1();
        SingleTon1 s2 = SingleTon1.gSingleTon1();
    }
    
}
