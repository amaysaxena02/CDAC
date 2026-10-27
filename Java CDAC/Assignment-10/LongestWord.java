import java.io.*;

class LongestWord {
    public static void main(String[] args) {
        String longest = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z0-9]", "");

                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }

            br.close();

            System.out.println("Longest word: " + longest);
            System.out.println("Length: " + longest.length());

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}