public class Isinstance {
    public static void main(String[] args) throws Exception {
        String str = new String();
        System.out.println(Class.forName(args[0]).isInstance(str));
    }
}
