package jpassion;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        /*  For the test we will need a BlockingQueue to be used by both threads
         *  Initially use an ArrayBlockingQueue which is the simplest concrete
         *  implementation of the BlockingQueue interface.  The constructor takes
         *  the size of the queue as a parameter
         */
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

        /*  Use the utility method from the Executors class to get an
         *  ExcutorService reference that will allow us to execute a single
         *  thread
         */
        ExecutorService loggerExecutor = Executors.newSingleThreadExecutor();
        loggerExecutor.execute(new TaskThatTakesMessagesFromBlockingQueue(queue));

        /*  Again use the utility Executors class to get a new ExecutorService
         *  for a second new thread and pass a BlockingQueueTask instance to it to run
         */
        ExecutorService senderExecutor1 = Executors.newSingleThreadExecutor();
        senderExecutor1.execute(new TaskThatPlacesMessagesIntoBlockingQueue(
                queue, // BlockingQueue object
                1, // Id of the sender of the mssage
                6, // Number of messages to send
                500));  // The pause between sending each message

        ExecutorService senderExecutor2 = Executors.newSingleThreadExecutor();
        senderExecutor2.execute(new TaskThatPlacesMessagesIntoBlockingQueue(
                queue, // BlockingQueue object
                2, // Id of the sender of the mssage
                3, // Number of messages to send
                300));  // The pause between sending each message

    }
}