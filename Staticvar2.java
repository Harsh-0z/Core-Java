public class Staticvar2 {
    static int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Staticvar2 s = new Staticvar2();
        Staticvar2.x=999;
        s.y=888;

        Staticvar2 s1 = new Staticvar2();
        System.out.println(Staticvar2.x +"........"+s1.y);

    
        

    }
    
}
