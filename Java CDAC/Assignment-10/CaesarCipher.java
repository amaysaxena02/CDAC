import java.io.*;

class CaesarCipher {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            FileWriter enc = new FileWriter("enc_mssage.txt");

            String line;

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);

                    if (c >= 'a' && c <= 'z') {
                        c = (char)(c + 3);

                        if (c > 'z') {
                            c = (char)(c - 26);
                        }
                    }
                    else if (c >= 'A' && c <= 'Z') {
                        c = (char)(c + 3);

                        if (c > 'Z') {
                            c = (char)(c - 26);
                        }
                    }

                    enc.write(c);
                }

                enc.write("\n");
            }

            br.close();
            enc.close();

            BufferedReader encrypted =
                new BufferedReader(new FileReader("enc_mssage.txt"));

            FileWriter dec = new FileWriter("dec_message.txt");

            while ((line = encrypted.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);

                    if (c >= 'a' && c <= 'z') {
                        c = (char)(c - 3);

                        if (c < 'a') {
                            c = (char)(c + 26);
                        }
                    }
                    else if (c >= 'A' && c <= 'Z') {
                        c = (char)(c - 3);

                        if (c < 'A') {
                            c = (char)(c + 26);
                        }
                    }

                    dec.write(c);
                }

                dec.write("\n");
            }

            encrypted.close();
            dec.close();

            System.out.println("Encryption completed.");
            System.out.println("Decryption completed.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}