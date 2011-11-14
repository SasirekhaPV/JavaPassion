package jpassion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int NUMBER_THREADS = 4;

    public static void main(String[] args) {

        BasketWithLocks basketWithLocks = new BasketWithLocks();
        basketWithLocks.writeToBasketWithWriteLock("apple", 10);
        basketWithLocks.writeToBasketWithWriteLock("orange", 20);

        WriterTask writer = new WriterTask(basketWithLocks, "Writer 1");
        ReaderTask reader1 = new ReaderTask(basketWithLocks, "Reader 1");
        ReaderTask reader2 = new ReaderTask(basketWithLocks, "Reader 2");
        ReaderTask reader3 = new ReaderTask(basketWithLocks, "Reader 3");

        ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_THREADS);
        executorService.submit(writer);
        executorService.submit(reader1);
        executorService.submit(reader2);
        executorService.submit(reader3);

    }
}
