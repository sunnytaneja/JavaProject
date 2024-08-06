package com.corejavaproject.IOStream;

import lombok.extern.log4j.Log4j2;

import java.io.FileReader;
import java.io.FileWriter;

@Log4j2
public class CharacterStreamExample {

    public static void main(String[] args) {
        String inputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\inputfile.txt";
        String outputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\outputfile.txt";
        CharacterStreamExample obj = new CharacterStreamExample();
        obj.read(inputFile, outputFile);
    }

    public void read(String inputFile, String outputFile) {
        try (FileReader fileReader = new FileReader(inputFile);
             FileWriter fileWriter = new FileWriter(outputFile)) {

            int data;

            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }

        } catch (Exception ex) {
            log.error("Exception while reading/write the data from file", ex);
        }
    }

}
