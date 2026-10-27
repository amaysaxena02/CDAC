public class GoodMorningWelcome {
    private static class MessageThread extends Thread {
        private final String message;

        MessageThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println(message);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    interrupt();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread morningThread = new MessageThread("Good morning");
        Thread welcomeThread = new MessageThread("Welcome");

        morningThread.start();
        welcomeThread.start();

        morningThread.join();
        welcomeThread.join();
    }
}