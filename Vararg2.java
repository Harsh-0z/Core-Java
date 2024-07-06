public class Vararg2 {

    public static void sum(int... x){
        int total = 0;
        for (int x1:x){
            total = x1+total;
        }
        System.out.println("The total is:"+total);
    }
    
    public static void main(String[] args){
        sum();
        sum(10,20,30,40,91,1150,5464,46464);
        sum(1,2,3,4);
        sum(4455,5544,78797);
    }
    
}


