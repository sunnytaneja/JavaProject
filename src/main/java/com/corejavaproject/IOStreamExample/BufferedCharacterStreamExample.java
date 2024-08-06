package com.corejavaproject.IOStreamExample;

import java.io.*;

public class BufferedCharacterStreamExample {

    public static void main(String[] args) {
        String inputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\inputfile1.txt";
        String outputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\outputfile1.txt";

        BufferedCharacterStreamExample bufferedCharacterStreamExample = new BufferedCharacterStreamExample();
        bufferedCharacterStreamExample.readData(inputFile, outputFile);
    }

    public void readData(String inputFile, String outputFile) {
        String fileData;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            while ((fileData = bufferedReader.readLine()) != null) {
                bufferedWriter.write(fileData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
