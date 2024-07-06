public class Interface {
    public static void main(String[] args) {
        //1 
        Parent P = new Parent();
        P.m1();
       // P.m2();

       //2 
       Child c = new Child();
       c.m1(); // it shows child can by default have parent method here so it means Child class have 2 methods here 
       c.m2();

       //3

       Parent p1 = new Child();
       p1.m1();
      // p1.m2(); // IT SHOWS ERROR HERE BECAUSE WITH PARENT OBJECT AND CHILD REFERENCE WE CAN ONLY CALL PARENT METHOD NOT CHILD METHOD .

      //Child c1 = new Parent(); // we cannot create child object with using the parent reference .
    }
}
class Parent{
    public void m1(){
        System.out.println("Parent method");
    }
    
}
class Child extends Parent{
    public void m2(){
        System.out.println("child method");
    }
}