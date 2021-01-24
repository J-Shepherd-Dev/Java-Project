package Filereader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileReaderUsers {
    public static void main(String[] args) throws IOException {
        String file = "src/users.dat";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");


        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println(next);
        }
        scanner.close();



    }
}
