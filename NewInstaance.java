public class NewInstaance{
    public static void main(String[] args) throws Exception{
        Object o = Class.forName(args[0]).getDeclaredConstructor().newInstance();
        System.out.println("Object created for your class:"+o.getClass().getName());
    }
}