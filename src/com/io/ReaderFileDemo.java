package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFileDemo {

    public  static void main(String agrs[]) throws IOException
    {
        FileReader fr = new FileReader(".\\src\\com\\io\\file1.txt");

        BufferedReader br = new BufferedReader(fr);


        //br.readLine();
        String line = br.readLine();
        while (line != null) {
            System.out.print(line);
            line = br.readLine(); // read next line
            if (line != null) {
                System.out.println(); // print new line for next line
            }
        }

        fr.close();
    }
}
