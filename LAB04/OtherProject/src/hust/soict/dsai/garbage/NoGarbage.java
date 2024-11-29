package hust.soict.dsai.garbage;

import java.io.*;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        try {
            // Read the "largefile.txt" file using StringBuffer to concatenate strings
            FileInputStream fileInputStream = new FileInputStream("D:/20241/ooplab/LAB03/OtherProject/src/hust/soict/dsai/garbage/text.txt");
            int content;
            while ((content = fileInputStream.read()) != -1) {
                sb.append((char) content); // Use StringBuffer to concatenate strings
            }
            fileInputStream.close();
            // Convert the StringBuffer to the final String
            String result = sb.toString();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
