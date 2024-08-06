package com.corejavaproject.IOStreamExample;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {

    public static void main(String[] args) {
        String inputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\inputfile1.txt";
        String outputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\outputfile1.txt";
        CharacterStreamExample characterStreamExample= new CharacterStreamExample();
        characterStreamExample.readCharacterStreamData(inputFile, outputFile);
    }

    public void readCharacterStreamData(String inputFile, String outputFile) {
        try (FileReader fileReader = new FileReader(inputFile);
             FileWriter fileWriter = new FileWriter(outputFile)) {

            int data;

            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
