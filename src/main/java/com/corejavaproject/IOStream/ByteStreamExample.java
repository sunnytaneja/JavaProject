package com.corejavaproject.IOStream;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

@Log4j2
public class ByteStreamExample {

    public static void main(String[] args) {
        String inputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\inputfile.txt";
        String outputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\outputfile.txt";
        ByteStreamExample obj = new ByteStreamExample();
        obj.read(inputFile, outputFile);
    }

    public void read(String inputFile, String outputFile) {
        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
        } catch (Exception ex) {
            log.error("Exception while reading/write the data from file", ex);
        }
    }
}
