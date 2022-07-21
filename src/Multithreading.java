/*Multithreading in java is a process of executing multiple threads simultaneously .
/A thread is light weight sub- process, the smallest unit of processing. Multiprocessing and multithreading. both are uesd to achieve multitasking.

Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be acieved in two ways ;
1. Process based multi-tasking:-
 it process has an sddress in memory
A process is heavy weight
cost of communication between the process is high.
Switchiing from  one process to another requires some time for saving and loading registers.


2. Thread based Multitasking : -
Threads is lightweight.
Cost of communication between the thread is low*/



/*COntrolling the main thread */
public class Multithreading {
    //TODO-
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("current thread: " + t);

        try{
            for(int n = 5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e){
            System.out.println("Mian thread Interrupted");
        }
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/
/*Creating a thread*/

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        /*create a new second thread*/
        t = new Thread(this, "Demo Thread");
        System.out.println("child Thread: " + t);
        t.start(); //this method will start the thread.
    }


    /*This is entry point for the second thread*/
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

class MainThreadDemo{
    public static void main(String[] args) {
        new NewThread(); // this will create a new thread

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
