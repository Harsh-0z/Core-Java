

public class ArrayExample1 {
    public static void main(String [] args){
        int[] [] x = new int[2][3];
        x[0] = new int[2];
        x[1] = new int[4];// arrays of arrays 2d array represntatoion in java

        //3d array representaion in java.
        int[][][] y = new int[3][][];//creating a three dimensional array 
        y[0] = new int[2][];// for first indexs sub array.
        y[0][0] = new int[1];
        y[0][1] = new int[4];

        y[1] = new int[5][];//for second indexes sub array .
        y[1][0]= new int[1];
        y[1][1]= new int[2];
        y[1][2]= new int[3];
        y[1][3]= new int[4];
        y[1][4]= new int[1];

        int[] z ={1,55,66};//shortcut to create 1d array 
        System.out.println(z[2]);

        int[][]a={{10,20},{30,40,50}};//shortcut to create 2d array in one line
        System.out.println(a[1][2]);//it will print 50 here

        int[][][] b = {{{50,60},{90,105,116,115}},{{49,45},{88,89}}};
        System.out.println(b[0][1][2]);//116
        System.out.println(b[0][0][0]);//50
        System.out.println(b[1][1][0]);//88
        // System.out.println(b[1][1][5]);//array index out of bound exception 

        int c;//divided one statement int c = 10 into 2 line.
        c =10;

        // int d[] ;
        // d={10,20,30}; here we get compile time error statement not found.

        int[] d = new int[6];
        // System.out.println(x.length()); length method is not valid for array 
        System.out.println(d.length);//it is final varible. ]

        String s = new String("Hello durga sir");
        System.out.println(s.length());//return length of string s here so thats the difference here between string and array length .

        int[][] f = new int[5][7];
        System.out.println(f.length);//5
        System.out.println(f[0].length);//7 
        System.out.println(y[0].length+y[1].length+y[2].length+y[3].length+y[4].length);//total length of array f if array is filled with some elements in it.


    }
    
}
