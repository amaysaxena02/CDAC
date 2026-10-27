import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class WordCountThreads {
    private static class FileWordCounter extends Thread {
        private final Path file;
        private int wordCount;

        FileWordCounter(Path file) {
            super("Counter-" + file.getFileName());
            this.file = file;
        }

        @Override
        public void run() {
            try {
                String contents = Files.readString(file).trim();
                wordCount = contents.isEmpty()
                        ? 0
                        : contents.split("\\s+").length;
                System.out.println(file + " : " + wordCount + " words");
            } catch (IOException exception) {
                System.err.println("Could not read " + file + ": " + exception.getMessage());
            }
        }

        int getWordCount() {
            return wordCount;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        if (args.length < 2) {
            System.out.println("Usage: java WordCountThreads <file1> <file2> [file3 ...]");
            return;
        }

        List<FileWordCounter> counters = Arrays.stream(args)
                .map(Path::of)
                .map(FileWordCounter::new)
                .toList();

        counters.forEach(Thread::start);
        for (FileWordCounter counter : counters) {
            counter.join();
        }

        int total = counters.stream()
                .mapToInt(FileWordCounter::getWordCount)
                .sum();
        System.out.println("Total words: " + total);
    }
}