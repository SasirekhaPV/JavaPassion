package jpassion;

class MyRunnableTask implements Runnable {

    private int i;
    CounterUsingAtomicInteger ii;

    MyRunnableTask(int i, CounterUsingAtomicInteger ii) {
        this.i = i;
        this.ii = ii;
    }

    public void run() {
        int newlyIncrementedValue = ii.incrementCount();
        System.out.println("Task " + i + " is running, " + "Atomic integer = " + newlyIncrementedValue);
    }
}
