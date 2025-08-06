package com.io;

import java.io.*;
import java.util.Scanner;

public class WritingFile {

    public static void main(String agrs[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        // File create or directly pass the  file locaiton

        File f= new File(".\\src\\com\\io\\myfile.txt");

        System.out.println(f.getAbsolutePath());
        FileOutputStream fos=null;
        try {
            //write
             fos = new FileOutputStream(f);
            String str = "Welcome to java program!";

                fos.write(str.getBytes());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fos.close();
        }
       System.out.println("Writing complete!!");

        //FileInputStream  fis = new FileInputStream(f);


        // read and write

    }
}
