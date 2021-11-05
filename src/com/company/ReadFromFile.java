package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Dateiname: ");
        String fileName = in.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);

            while(true) {
                int read = fileReader.read();
                if(read == -1) {
                    break;
                }
                System.out.println((char) read);
            }
        } catch(FileNotFoundException fileNotFoundException) {
            System.out.println("File nicht gefunden");
        } catch(IOException ioException) {

        }
    }
}
