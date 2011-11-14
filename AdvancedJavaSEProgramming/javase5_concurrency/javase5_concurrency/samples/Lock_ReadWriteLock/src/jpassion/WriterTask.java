package jpassion;

import java.util.Random;

public class WriterTask extends Thread {

    private int numberOfTimesToWrite = 0;
    private BasketWithLocks dictionary = null;

    public WriterTask(BasketWithLocks d, String threadName) {
        this.dictionary = d;
        this.setName(threadName);
    }

    @Override
    public void run() {
        while (numberOfTimesToWrite++ < 5) {
            String[] keys = dictionary.getKeysFromBasketWithReadLock();
            for (String key : keys) {
                Integer newValue = (new Random(numberOfTimesToWrite)).nextInt(10);
                //updating dictionary with WRITE LOCK
                dictionary.writeToBasketWithWriteLock(key, newValue);
            }

            //update every seconds
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopWriter() {
        this.numberOfTimesToWrite = 0;
        this.interrupt();
    }
}
