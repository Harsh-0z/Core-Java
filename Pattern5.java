
class Pattern5{
    public static void main(String[] args) {
        int n=4;
        // outer loop for rows
        for(int i =1 ; i<=n;i++){
            //inner loop 1 for space printing.
            for(int j=1;j<=n-i;j++){
             System.out.print(" ");
            }
            //2nd inner loop for printing star
            for(int j =1;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}