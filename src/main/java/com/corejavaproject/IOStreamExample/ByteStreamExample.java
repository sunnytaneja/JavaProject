package com.corejavaproject.IOStreamExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) {
        String inputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\inputfile1.txt";
        String outputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\outputfile1.txt";

        ByteStreamExample byteStreamExample = new ByteStreamExample();
        byteStreamExample.readByteStreamData(inputFile, outputFile);
    }

    public void readByteStreamData(String inputuFile, String outputFile) {
        int fileData;
        try (FileInputStream fileInputStream = new FileInputStream(inputuFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            while ((fileData = fileInputStream.read()) != -1) {
                fileOutputStream.write(fileData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
