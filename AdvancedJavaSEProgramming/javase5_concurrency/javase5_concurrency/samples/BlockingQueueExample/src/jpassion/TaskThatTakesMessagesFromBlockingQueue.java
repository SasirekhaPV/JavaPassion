package jpassion;

import java.util.concurrent.*;

/**
 *  Runnable that consumes information placed in a blocking queue.  This
 *  demonstrates the simple synchonisation that can be achieved with the
 *  new BlockingQueue class.
 **/
public class TaskThatTakesMessagesFromBlockingQueue implements Runnable {
    
    private BlockingQueue<String> messageQueue;
    
    /**
     *  Constructor
     *
     * @param messageQueue The queue that will be used to pass messages
     * between the two threads
     **/
    public TaskThatTakesMessagesFromBlockingQueue(BlockingQueue<String> messageQueue) {
        this.messageQueue = messageQueue;
    }
    
    /**
     *  Run method simply takes messages from the queue when they're there
     *  and pushes them to the stdout
     **/
    public void run() {
        try {
            while (true) {
                System.out.println("LOG MSG: " + messageQueue.take());
            }
        } catch (InterruptedException ie) {
            // Ignore
        }
    }
}