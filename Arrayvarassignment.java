public class Arrayvarassignment {
    public static void main(String[] args) {
        int[]x = {10,20,30,40};//case 1 element promosions are not applicable at array level.
        char[] ch = {'a','b','c','d','e'};
        int []b = x;//possible becoz same type of new reference b is here.
        // int[] c = ch;----not possible becoz different data type of variance is there for char is available here.
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }
        
        //case 2 
        //in the case of object type of array child class type array can be promoted to parent class array .

        String[] s ={"A","B","C"};// here string is part of Object class so assigning string type array to Object class type array is possible .
        Object[] a = s;
        System.out.println(a[1]);


        //case2 whenever we are assigning one array to another array internal elements wont be copied just a reference variable will be changed.
        int[]h = {10,20,30,40};
        int[]g ={50,60};

        
        g=h; // npw g array is refering to h array and h array is still exsist there .
        // same way h=g we can perform here.
        

        for (int i=0;i<h.length;i++){
            System.out.println(h[i]);
        }
        
        for(int i=0;i<g.length;i++){
            System.out.println(g[i]);
        }

    }
}
