class SmallestNoArray{
    public static void main(String [] args){
        int[] x ={10,2,5,7,1000,50,10};
        SmallestNumber(x);

    }
    public static void SmallestNumber(int[] a){
        int smallnumber =a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]<smallnumber){
                smallnumber=a[i];
            }
        }
        System.out.println("The smallest no in the array is:"+smallnumber);


    }
  




}