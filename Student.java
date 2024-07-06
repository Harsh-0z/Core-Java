abstract class Person {
    String age;
    String name;

    // Constructor
    Person(String name, String age) {
        this.name = name; // Assign the parameter name to the instance variable
        this.age = age;   // Assign the parameter age to the instance variable
    }
}

class Student extends Person {
    int rollno;

    // Constructor
    Student(int rollno, String name, String age) {
        super(name, age); // Call the constructor of the superclass (Person)
        this.rollno = rollno; // Assign the parameter rollno to the instance variable
    }

    public static void main(String[] args) {
        // Creating an instance of Student class
        Student s = new Student(50, "Harsh", "21");

        // Printing details
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Roll No: " + s.rollno);
    }
}
