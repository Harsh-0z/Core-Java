import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // String to be tokenized
        String sentence = "This is a sample sentence.";

        // Using StringTokenizer with while loop
        System.out.println("Tokenizing using StringTokenizer:");
        StringTokenizer tokenizer = new StringTokenizer(sentence," ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        

        
    }
    }
}
