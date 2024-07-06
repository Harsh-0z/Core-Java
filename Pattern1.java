import java.util.Scanner;

class Pattern1{
    public static void main(String[] args) {
        System.out.println("Solid Rectangle problem");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the i loop value");
        int n = s.nextInt();
        System.out.println("Enter the j loop value ");
        int m = s.nextInt();
        for(int i = 1 ; i<=n ; i++){ // Outer loop 
            for (int j =1 ; j<= m ; j++){// inner loop 
                System.out.print("*");
            }
            System.out.println();
        }
    }



}