import java.io.*;
public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {  // we ,ust have to handle the checked exception first 
        PrintWriter pw = new PrintWriter("abc.txt"); // checked exception checked by compiler . compiler is giving warning that there may
        pw.println("hello boss"); // be a chance of occuring and exception so u first handle it and than i will compile the code for u.
    }
}
