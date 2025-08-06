package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDemoChar {

    public static void main(String args[])throws IOException
    {
        File f = new File(".\\src\\com\\io\\file1.txt");

        FileWriter fw = new FileWriter(f);

        String str= " A comprehensive Java training project designed for beginners and intermediate learners. This repository includes hands-on exercises, sample projects, and real-world coding challenges to help you master core Java concepts such as OOP, data structures, exception handling, file I/O, multithreading, JDBC, and more.";

        fw.write(str);

        fw.close();


    }
}
