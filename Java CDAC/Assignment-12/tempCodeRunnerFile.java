public class SleepJoinDemo {
    private static class Worker extends Thread {
        Worker(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int step = 1; step <= 5; step++) {
                System.out.println(getName() + " completed step " + step);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    System.out.println(getName() + " was interrupted.");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Worker("Worker thread");
        worker.start();

        System.out.println("Main thread is waiting using join().");
        worker.join();
        System.out.println("Worker finished; main thread continues.");
    }
}