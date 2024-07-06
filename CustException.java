public class CustException {
    public static void main(String[] args){
        int age = Integer.parseInt(args[0]);

        if(age>60){
            throw new TooYoungException("you are too old");

        }else if(age<18){
            throw new TooOldException("you are too young");
        }
        else{
            System.out.println("we will send matches to you via email");
        }
    }
}

class TooYoungException extends RuntimeException{

    public TooYoungException(String s) {
        super(s);
    }
    
}
class TooOldException extends RuntimeException{

    public TooOldException(String s) {
        super(s);
    }
    
}