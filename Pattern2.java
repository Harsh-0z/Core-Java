class Pattern2{
    public static void main(String[] args) {
        System.out.println("This is hollow rectangle pattern program ");
        int a = 4;
        int b = 5;
        // outerloop i for no of rows
        for( int i =1 ; i<=a ; i++){
            // inner loop with condition for columns
            for( int j =1 ; j<=b ; j++){
                if( i == 1 || j == 1 || i == a || j == b){
                    System.out.print("^");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
    }
}