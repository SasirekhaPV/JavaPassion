package jpassion;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterUsingAtomicInteger {

    private AtomicInteger count = new AtomicInteger(0);

    public int incrementCount() {
        return count.incrementAndGet();
    }

}
