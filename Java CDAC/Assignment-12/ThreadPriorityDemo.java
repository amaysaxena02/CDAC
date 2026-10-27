public class ThreadPriorityDemo {
    private static class PriorityThread extends Thread {
        PriorityThread(String name, int priority) {
            super(name);
            setPriority(priority);
        }

        @Override
        public void run() {
            System.out.println(
                    "currentThread(): " + Thread.currentThread().getName()
                            + ", getPriority(): " + getPriority());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        System.out.println("Main priority before setPriority(): "
                + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main priority after setPriority(): "
                + Thread.currentThread().getPriority());

        Thread lowPriorityThread = new PriorityThread("Low priority", Thread.MIN_PRIORITY);
        Thread normalPriorityThread = new PriorityThread("Normal priority", Thread.NORM_PRIORITY);
        Thread highPriorityThread = new PriorityThread("High priority", Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();

        lowPriorityThread.join();
        normalPriorityThread.join();
        highPriorityThread.join();

        System.out.println("Priority is a scheduling hint; output order may vary.");
    }
}