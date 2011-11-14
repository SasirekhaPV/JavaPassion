package jpassion;

import java.util.concurrent.*;

public class Main {

    private static final int NUMBER_OF_RESOURCES = 2;
    private static final int NUMBER_OF_RESOURCE_USERS = 3;
    
    public static void main(String[] args) {

        // Create a resource pool with only two resources in it.
        // In this application, 3 resource users are competing for these
        // two resources through a semaphore.
        ResourcePoolManagedBySemaphore pool = 
                new ResourcePoolManagedBySemaphore(NUMBER_OF_RESOURCES);

        // Use the Executors utility class to get a new FixedThreadPool.
        // 3 Resource user tasks are going to be managed by the ExecutorService.
        ExecutorService executorService = 
                Executors.newFixedThreadPool(NUMBER_OF_RESOURCE_USERS);

        // Create three new resource users and start them using the previously
        // initialised thread pool
        ResourceUserTask r1 = new ResourceUserTask(
                pool, // Resource pool
                1, // Thread id
                5, // Run count
                400, // Hold duration
                500);   // Pause duration
        ResourceUserTask r2 = new ResourceUserTask(pool, 2, 5, 800, 500);
        ResourceUserTask r3 = new ResourceUserTask(pool, 3, 5, 1200, 500);

        // Start executing ResourceUserTask tasks
        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);

        // Clean up the thread pool so the program terminates cleanly 
        executorService.shutdown();
    }
}