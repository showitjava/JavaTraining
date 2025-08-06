package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingDemo {

    public  static void main(String agrs[]) throws IOException
    {
        File f = new File(".\\src\\com\\io\\myfile.txt");

        FileInputStream fis = new FileInputStream(f);

        int size = fis.available();
        byte [] b = new byte[size];
        fis.read(b); // single byte  welcome to java

        String data = new String(b);
        System.out.println(data);
        fis.close();
       //starting date > read  1year
        //Changes done for git purpose
    }
}
