

public class ThrredyArrayElementBack {
    public static void main(String... args){
        int [] [] [] x = {{{10,20,30},{40,50}},{{60,70},{80}}};

        for(int i =0 ; i<x.length;i++){
            for(int j =0; j<x[i].length;j++){    // for loop code for printing 3d array element in java
                for(int k=0;k<x[i][j].length;k++){
                    System.out.println(x [i] [j] [k]);
                }

            }

        }
        for(int [] [] x1:x){
            for(int[] x2:x1){
                for(int x3:x2){     // foor each loop for print 3d array elements in java .
                    System.out.println(x3);
                }
            }
        }

    }
    
}
