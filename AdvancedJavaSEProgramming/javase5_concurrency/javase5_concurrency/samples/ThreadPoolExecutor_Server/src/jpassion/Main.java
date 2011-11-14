package jpassion;

import java.io.*;

public class Main {
    
    private static final int SERVER_PORT = 8100;
    
    public static void main(String[] args) {
        System.out.println("Listening for connections...");
        ServerUsingThreadPoolExecutor ce = null;
        
        try {
            ce = new ServerUsingThreadPoolExecutor(SERVER_PORT, 4);
            
            /*
             * Serve incoming connection request until interrupted.
             */
            ce.serviceRequests();
        } catch (IOException ioe) {
            System.out.println("IO Error creating listener: " + ioe.getMessage());
        }
    }
}