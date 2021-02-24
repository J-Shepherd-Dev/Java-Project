package Filereader;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;



    public class FileReaderRatings {

        public void readFileRating(String[] args) throws IOException{
        String file = "src/ratings.dat";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");


        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println(next);
        }
            scanner.close();




    }
}