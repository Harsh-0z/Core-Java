
import java.util.Scanner;
class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inverted half pyramid example");
        System.out.println("Enter the number of rows you need inverted pyramid");

        int n = s.nextInt();
        for( int i =1 ; i<=n ; i++)
        {
            for(int j=i ; j<=n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
