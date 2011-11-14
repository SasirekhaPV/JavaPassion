package jpassion;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    CounterUsingAtomicInteger counterUsingAtomicInteger = new CounterUsingAtomicInteger();
    // Creates a thread pool that reuses a fixed number of threads 
    // operating off a shared unbounded queue. At any point, at most 
    // specified number of threads will be active processing tasks. If additional 
    // tasks are submitted when all threads are active, they will wait 
    // in the queue until a thread is available. If any thread terminates 
    // due to a failure during execution prior to shutdown, a new one 
    // will take its place if needed to execute subsequent tasks. The 
    // threads in the pool will exist until it is explicitly shutdown.
    ExecutorService executor = Executors.newFixedThreadPool(3);

    public void startSubmittingTasks() throws IOException {
        int i = 0;
        Future future;
        while (!executor.isShutdown() && i < 10) {
            future = executor.submit(new MyRunnableTask(i++, counterUsingAtomicInteger));
        }

        // Initiates an orderly shutdown in which previously submitted 
        // tasks are executed, but no new tasks will be accepted. Invocation 
        // has no additional effect if already shut down.
        executor.shutdown();
    }

    public static void main(String argv[]) throws Exception {
        new Main().startSubmittingTasks();
    }
}
