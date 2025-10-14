import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Write to a file
        try {
            FileOutputStream fout = new FileOutputStream(filename);
            String data = "Hello, this is file I/O in Java!";
            byte[] b = data.getBytes(); // convert string to bytes
            fout.write(b);
            fout.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from a file
        try {
            FileInputStream fin = new FileInputStream(filename);
            int i;
            System.out.println("Reading data from file:");
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
