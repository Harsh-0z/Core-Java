import static java.lang.Math.sqrt; // we can write till static member in static import case.
// in the case of static import current class's which member should be executed first.
// 1. static member of that class
// 2. explicit static import statement 
// 3. implicit static import statement 


class StaticImport{
    public static void main(String[] args) {
        System.out.println(sqrt(50));
    }
}