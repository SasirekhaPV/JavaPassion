package jpassion;

import java.net.*;
import java.io.*;
import java.util.concurrent.*;

public class ServerUsingThreadPoolExecutor {
    
    private final static int MAX_THREADS = 2;
    
    private final ServerSocket serverSocket;
    private final ThreadPoolExecutor threadPoolExecutor;
    private final ArrayBlockingQueue<Runnable> workQueue;
    
    /**
     *  Constructor
     **/
    public ServerUsingThreadPoolExecutor(int port, int poolSize) throws IOException {
        
        /*  Create a new ServerSocket to listen for incoming connections  */
        serverSocket = new ServerSocket(port);
        
       /*  In order to create a pool of threads, we must first have a queue
        *  that will be used to hold the work tasks before they are executed
        *  For this example we use a ArrayBlockingQueue that can hold the
        *  same number of tasks as we have maximum threads
        */
        workQueue = new ArrayBlockingQueue<Runnable>(MAX_THREADS);
        
        // Creates a new ThreadPoolExecutor with the given initial parameters 
        // and default thread factory and rejected execution handler. It may 
        // be more convenient to use one of the Executors factory methods instead of this general purpose constructor.
        threadPoolExecutor = new ThreadPoolExecutor(MAX_THREADS, MAX_THREADS,
                60, TimeUnit.SECONDS, workQueue);
    }
    
    /**
     *  Service requests
     **/
    public void serviceRequests() {
        int count = 1;
        int qLength = 0;
        
        try {
            for (;;) {
                if ((qLength = workQueue.size()) > 0)
                    System.out.println("Queue length is " + qLength);
                
                threadPoolExecutor.execute(new ConnectionHandler(serverSocket.accept(), count++));
            }
        } catch (IOException ioe) {
            System.out.println("IO Error in ConnectionHandler: " + ioe.getMessage());
            threadPoolExecutor.shutdown();
        }
    }
    
}