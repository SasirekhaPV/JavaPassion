package jpassion;

import java.net.*;
import java.io.*;
import java.util.concurrent.*;

public class ServerUsingExecutors {
    
    private final ServerSocket serverSocket;
    private final ExecutorService executeService;
    
    public ServerUsingExecutors(int port, int poolSize) throws IOException {
        /*  Create a new ServerSocket to listen for incoming connections  */
        serverSocket = new ServerSocket(port);
        
        // newFixedThreadPool() Creates a thread pool 
        // that reuses a fixed number of threads operating 
        // off a shared unbounded queue.
        executeService = Executors.newFixedThreadPool(poolSize);
        
    }
    
    /**
     *  Service requests
     **/
    public void serviceRequests() {
        int count = 1;
        int qLength = 0;
        
        try {
            for (;;) {
                executeService.execute(new ConnectionHandlerTask(serverSocket.accept(), count++));
            }
        } catch (IOException ioe) {
            System.out.println("IO Error in ConnectionHandler: " + ioe.getMessage());
            executeService.shutdown();
        }
        
    }

}