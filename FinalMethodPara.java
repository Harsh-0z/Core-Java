public class FinalMethodPara {
    public static void main(String[] args) {
        sum(10,20);
    }
    public static void sum( final int x ,int y ){ // if we use final in FORMAL PARAMETERS IT WILL ONLY ACCSEPT ACTULAL PARA
        //VALUES ONLY.
    //    x = 100;
    //    y = 1000;
        System.out.println(x+"...."+y);
    }
}
