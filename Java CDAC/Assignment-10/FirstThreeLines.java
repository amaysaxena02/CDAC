import java.io.*;

class FirstThreeLines {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}