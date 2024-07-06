import java.util.Scanner;;


public class FallThrough {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the choice between 1 to 4");
        int x = s.nextInt();
        switch(x){
            case 1:
                System.out.println("Hello 1");
            case 2:
                System.out.println("Hello 2");
            case 3:
                System.out.println("Hello 3 ");
                break;
            case 4:
                System.out.println("Hello 4");
            default:
                System.out.println("hello default");
                break;

        }
    }
    
}
