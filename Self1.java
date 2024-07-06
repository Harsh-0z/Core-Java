
import java.util.Scanner;
// this program is for substraction of multiple numbers using var arg.

class Self1{
    public static void main(String [] args){
        System.out.println("Enter the 3 numbers  to substract");
        Scanner k = new Scanner(System.in);
        int x,y,z;
        x= k.nextInt();
        y= k.nextInt();
        z=k.nextInt();

        sub(x,y,z);


    }


    public static void sub(int...a){
        int number = a[0];
        for(int i=1;i<a.length;i++){
            number =number-a[i];
        }
        System.out.println("Your substracted total is:");
        System.out.println(number);
    }

}