import java.util.Scanner;

public class Switchcal {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Enter your choice :");
        System.out.println("opeartions availabe");
        System.out.println("1 for addition");
        System.out.println("2 for substraction");
        System.out.println("3 for multilplication");
        System.out.println("4 for division");

        int choice = k.nextInt();

        System.out.println("Enter the two numbers that you want to perform operation");

        double num1 = k.nextDouble();
        double num2 = k.nextDouble();

        double result = 0;

        switch(choice){
            case 1:
                result = num1+num2;
                System.out.println(result);
                break;
            case 2:
                result=num1-num2 ;
                System.out.println(result);
                break;
            case 3:
                result = num1*num2;
                System.out.println(result);
                break;
            case 4:
                result = num1/num2;
                System.out.println(result);  
                break;
            default:
                System.out.println("NO OPERATION FOUND ");              
            
        }
        
    }
}
