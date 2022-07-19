//Synchronization in Java is the capability to the control the access of multiple threads to any shared resource .
//Java Synchronization is better option where we want to follow only one thread to access the shared res




class Synchronization {

}


// A class used to send a message
class Sender {
    public void send(String msg) {
        System.out.println("sending\t" + msg);
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            System.out.println("thread interrupted");
//        }
//        System.out.println("\n" + msg + "sent");
    }
}

//class for send a message using threads
class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    //recieves a message object using a string
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        //only one thread can send a message at a time
        synchronized (sender) {
            //synchronizing the send object
            sender.send(msg);
        }
    }
}

//class which will be executed
class Sync {
    public static void main(String[] args) {
        Sender send = new Sender();
        ThreadedSend S1 =
                new ThreadedSend(" Hello ", send);
        ThreadedSend S2 =
                new ThreadedSend(" Bye ", send);

        //start two threads of ThreadSend type
        S1.start();
        S2.start();

        //wait for theads to end
        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("interuppt");
        }
    }
}
