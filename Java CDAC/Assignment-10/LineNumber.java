import java.io.*;

class LineNumber {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            FileWriter fw = new FileWriter("numbered.txt");

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                fw.write(lineNumber + ": " + line + "\n");
                lineNumber++;
            }

            br.close();
            fw.close();

            System.out.println("File copied with line numbers.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}