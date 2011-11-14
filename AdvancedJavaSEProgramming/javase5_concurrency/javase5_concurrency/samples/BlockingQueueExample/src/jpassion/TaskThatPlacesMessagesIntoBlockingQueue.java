package jpassion;

import java.util.concurrent.*;

/**
 *  Send messages to a Logger via a BlockingQueue
 **/
public class TaskThatPlacesMessagesIntoBlockingQueue implements Runnable {
    
    private BlockingQueue<String> messageQueue;
    private int id;
    private int count;
    private long pause;
    
    /**
     *  Constructor
     *
     * @param messageQueue The queue to send messages to
     * @param id The ID number of this sender
     * @param count The number of messages to send
     * @param pause The pause between sending each message
     **/
    public TaskThatPlacesMessagesIntoBlockingQueue(BlockingQueue<String> messageQueue, int id,
            int count, long pause) {
        this.messageQueue = messageQueue;
        this.id = id;
        this.count = count;
        this.pause = pause;
    }
    
    /**
     *  Run method to send the messages
     **/
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                messageQueue.put("Content of the mssage sent to the queue: Sender ID = " + id + ", log message number = " + i);
                Thread.sleep(pause);
            }
        } catch (InterruptedException ie) {
            //  Ignore
        }
    }
   
}