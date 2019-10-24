// reading file with FileReader

package com.caveofprogramming.javatutorial.p39;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException e) {
                System.out.println("File is not opened.");
            }
        }

    }
}
