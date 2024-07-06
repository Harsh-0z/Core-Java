import java.util.*; // it is a implicit import
import java.util.Scanner; // it is a explicit import .


// in the case of simple import what is the prcedence?
// 1 . explicit import 
// 2. current working directory or default packge is import 
// 3 . implicit import 

public class Import {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println(k);
    }
}
