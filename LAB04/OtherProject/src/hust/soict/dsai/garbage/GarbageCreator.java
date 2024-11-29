package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "D:/20241/ooplab/LAB03/OtherProject/src/hust/soict/dsai/garbage/text.txt";
        byte[] inputBytes = new byte[0];
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();

            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;
            }

            endTime = System.currentTimeMillis();
            System.out.println("Processing time with String concatenation (using +): " + (endTime - startTime) + " ms");

            startTime = System.currentTimeMillis();

            StringBuffer sb = new StringBuffer();
            for (byte b : inputBytes) {
                sb.append((char) b);
            }
            outputString = sb.toString();

            endTime = System.currentTimeMillis();
            System.out.println("Processing time with StringBuffer: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
