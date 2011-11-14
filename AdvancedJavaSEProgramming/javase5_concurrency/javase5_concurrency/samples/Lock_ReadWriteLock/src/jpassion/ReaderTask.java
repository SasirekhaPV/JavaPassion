package jpassion;

public class ReaderTask extends Thread {

    private BasketWithLocks basket = null;

    public ReaderTask(BasketWithLocks d, String threadName) {
        this.basket = d;
        this.setName(threadName);
    }
    private int numberOfTimesToRead = 0;

    @Override
    public void run() {
        while (numberOfTimesToRead++ < 5) {
            String[] keys = basket.getKeysFromBasketWithReadLock();
            for (String key : keys) {
                //reading from basket with READ LOCK
                Integer value = basket.getFromBasketWithReadLock(key);

                //make what ever you want with the value.
                System.out.println(key + " : " + value);
            }

            //update every one second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopReader() {
        this.numberOfTimesToRead = 0;
        this.interrupt();
    }
}
