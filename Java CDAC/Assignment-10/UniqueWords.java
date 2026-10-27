import java.io.*;
import java.util.*;

class UniqueWords {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            HashMap<String, Integer> map = new HashMap<>();

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");

                    if (!word.isEmpty()) {
                        if (map.containsKey(word)) {
                            map.put(word, map.get(word) + 1);
                        } else {
                            map.put(word, 1);
                        }
                    }
                }
            }

            br.close();

            System.out.println("Unique words:");

            for (String word : map.keySet()) {
                if (map.get(word) == 1) {
                    System.out.println(word);
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}