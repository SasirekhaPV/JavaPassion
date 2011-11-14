package jpassion;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BasketWithLocks {

    private final ReentrantReadWriteLock readWriteLock =
            new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();
    
    private HashMap<String, Integer> basket = new HashMap<String, Integer>();

    public void writeToBasketWithWriteLock(String key, Integer value) {
        // Acquire the lock.  If the lock is not available then the current 
        // thread becomes disabled for thread scheduling purposes and lies 
        // dormant until the lock has been acquired.
        writeLock.lock();
        try {
            basket.put(key, value);
        } finally {
            // Release the lock
            writeLock.unlock();
        }
    }

    public Integer getFromBasketWithReadLock(String key) {
        readLock.lock();
        try {
            return basket.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public String[] getKeysFromBasketWithReadLock() {
        readLock.lock();
        try {
            String keys[] = new String[basket.size()];
            return basket.keySet().toArray(keys);
        } finally {
            readLock.unlock();
        }
    }

}