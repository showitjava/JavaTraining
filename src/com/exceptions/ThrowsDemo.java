package com.exceptions;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    public static  void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
       try
       {
           readFile();
       }
       catch (IOException e)
       {
 }
        System.out.println("File not found Please correct your path!!");

        System.out.println("Rest of Your code works fine!!");

    }
    static void  readFile() throws IOException
    {
        System.out.println(Thread.currentThread().getName());
        FileReader fr = new FileReader("note.txt");
    }
}
