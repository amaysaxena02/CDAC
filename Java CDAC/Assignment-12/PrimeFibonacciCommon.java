import java.util.ArrayList;
import java.util.List;

public class PrimeFibonacciCommon {
    private static class NumberProducer extends Thread {
        private final List<Integer> numbers = new ArrayList<>();
        private final boolean producePrimes;

        NumberProducer(String name, boolean producePrimes) {
            super(name);
            this.producePrimes = producePrimes;
        }

        @Override
        public void run() {
            if (producePrimes) {
                for (int number = 2; number <= 1000; number++) {
                    if (isPrime(number)) {
                        numbers.add(number);
                    }
                }
            } else {
                int first = 0;
                int second = 1;
                while (first <= 1000) {
                    numbers.add(first);
                    int next = first + second;
                    first = second;
                    second = next;
                }
            }
            System.out.println(getName() + ": " + numbers);
        }

        private boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    return false;
                }
            }
            return true;
        }

        List<Integer> getNumbers() {
            return numbers;
        }
    }

    private static class CommonNumberThread extends Thread {
        private final List<Integer> first;
        private final List<Integer> second;

        CommonNumberThread(List<Integer> first, List<Integer> second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public void run() {
            List<Integer> commonNumbers = first.stream()
                    .filter(second::contains)
                    .toList();
            System.out.println("Common numbers: " + commonNumbers);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NumberProducer primeThread = new NumberProducer("Prime numbers", true);
        NumberProducer fibonacciThread = new NumberProducer("Fibonacci numbers", false);

        primeThread.start();
        fibonacciThread.start();
        primeThread.join();
        fibonacciThread.join();

        Thread commonNumberThread = new CommonNumberThread(
                primeThread.getNumbers(), fibonacciThread.getNumbers());
        commonNumberThread.start();
        commonNumberThread.join();
    }
}