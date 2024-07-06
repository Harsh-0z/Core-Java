// in abstract class's main method we can create a subclass's object to call subclasss method output 
// abstract class mut be inherited.
// abstract classs main method must be implemented in child class if not than we are getting compile time error.
// if a class has abstarct method in it that class name must have abstract modifier in it .
// abstract class may contain final method in it but final class cannot contain abstract method in it .
// abstract is not suitable with any other moduifiers if abstarct is used with other modifier than we are getting compile time error
// no {} after abstratc method is declared .
// abstract method means partially declared method without implementation .
// abstract class means no object creation of that class.

abstract class Abstractmethod{ 
    public static void main(String[] args) {
        Bus bus = new Bus(); // we can create the object for subclass in abstract class for sure we will not get any error in that .
        bus.getNoofWheels();
        Abstractmethod c = new Abstractmethod(); // we cannot create the object for abstract class we will get compile time error 
            
        
    }
    abstract void getNoofWheels();
}
class Bus extends Abstractmethod{
    public void getNoofWheels(){
        System.out.println("6 wheels");
    }
}
