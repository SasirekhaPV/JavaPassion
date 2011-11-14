package jpassion;

import java.io.IOException;

public class Main {

    private static final int SERVER_PORT = 8100;
    private static final int POOL_SIZE = 2;

    public static void main(String[] args) {
        System.out.println("Listening for connections...");
        ServerUsingExecutors ce = null;

        try {
            ce = new ServerUsingExecutors(SERVER_PORT, POOL_SIZE);
            ce.serviceRequests();
        } catch (IOException ioe) {
            System.out.println("IO Error creating listener: " + ioe.getMessage());
        }
    }
}