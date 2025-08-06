package com.io;

import java.io.FileReader;
import java.io.IOException;

public class ReaderFileDemo {

    public  static void main(String agrs[]) throws IOException
    {
        FileReader fr = new FileReader(".\\src\\com\\io\\file1.txt");



        System.out.println((char)fr.read());
        int val =fr.read();
        while(val != -1)
        {
            System.out.print((char) val);
            val= fr.read();

        }

        fr.close();
    }
}
