public class Constructor{

    // constructors is used to perform the initialization of an object in java and it is not used to create the object.

    String name;
    int rollno;
    Constructor(String name , int rollno){
        this.name = name;
        this.rollno = rollno;

    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor("Harsh", 502);
        Constructor c2 = new Constructor("Hemant", 501);

        System.out.println(c1);
        System.out.println(c2);

    }
    
}