public class Person1 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    String name;
    int age;
    Person1(String name , int age){
        this.name = name ;
        this.age = age;

    }
}
class Student extends Person1{
    int rollno;
    int marks;
    Student(String name , int age , int rollno , int marks){
        super(name,age);
        this.rollno = rollno ;
        this.age = age ;
    }
    public static void main(String[] args) {
            Student s = new Student("Harsh", 21, 05, 80);
            }

}
