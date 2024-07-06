class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("child thread");
        }
    }
}

class MainThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();  // till here only one thread is there and child thread is instatiation.
        t.start();;// child thread starting

        for(int i = 0;i<=10;i++){
            System.out.println("main thread");
        }


    }
}

// overloading of the run method is possible but start method is always call the run method that is not having any argument .