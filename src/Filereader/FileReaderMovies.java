package Filereader;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class FileReaderMovies {

    public void readFileMovies(String[] args) throws IOException{
        String file = "src/movies.dat";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");


        while(scanner.hasNext()){
            String next = scanner.next();
            System.out.println(next);
        }

         scanner.close();


}
}