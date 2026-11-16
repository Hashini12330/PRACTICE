public class Main{
    public static void main(String[] args) {

        // 01
        myTask task = new myTask();

        Thread thread = new Thread(task);   // Thread is a class, and Runnable is an interface.        

        thread.start();

        
        
        // 02
        Pro task1 = new Pro();
        Thread t1 = new Thread(task1, "Thread 01");
        Thread t2 = new Thread(task1, "Thread 02");

        t1.start();
        t2.start();



    }
}

// 01
class myTask implements Runnable{

    public void run(){
        System.out.println("Task is running");
    }
}


// 02
class Pro implements Runnable{

    public void run(){  // always use only run() method
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

}