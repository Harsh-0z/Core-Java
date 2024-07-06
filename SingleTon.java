// if several people have same requirements than it is not recommanded to create a separate object for every 
// requirement  so we have to create only one object and we can reuse some object for every similar requirement so that perfomance will improve 

// thatys why we are using the single ton class object ..



// how to create your own single ton class 

class SingleTon{
    private static SingleTon t = new SingleTon();

    private SingleTon(){

    }

    public static SingleTon getSingleTon(){
        return t;
    }


    public static void main(String[] args) {
        SingleTon t2= SingleTon.getSingleTon();
    
        SingleTon t3 = SingleTon.getSingleTon(); 


        
    }
}