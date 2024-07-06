

public class Anonymous {
    public static void main(String[] args) {
        sum(new int[] {10,20,30,40,70,80});//anonymous array(we can create the array without name. used for instant use only)
        //how to convert anonymous array into simple array 
        //int[]x = new int[]{10,20,30};
    }
    public static void sum(int[] x){
        int total =0;
        for(int x1:x){
            total = total+x1;
        }
        System.out.println("The sum:"+total);
    }
    
}
