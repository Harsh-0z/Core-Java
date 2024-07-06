// so we can say that inheritence of the constructor is not possible .

class InheritConstructor{
    InheritConstructor(){
        System.out.println("no arg constructors");
    }
}
class C extends InheritConstructor{
    C(int i ){
        System.out.println("int argconstructors ");
    }

    C c = new C(10);

}