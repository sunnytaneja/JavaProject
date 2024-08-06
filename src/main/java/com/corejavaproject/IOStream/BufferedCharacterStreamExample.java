package com.corejavaproject.IOStream;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@Log4j2
public class BufferedCharacterStreamExample {

    public static void main(String[] args) {
        String inputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\inputfile.txt";
        String outputFile = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\outputfile.txt";
        BufferedCharacterStreamExample obj = new BufferedCharacterStreamExample();
        obj.read(inputFile, outputFile);
    }

    public void read(String inputFile, String outputFile){
        try(BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFile))){

            String data;

            while ((data = fileReader.readLine()) != null){
                fileWriter.write(data);
                log.info("Read data is:{}", data);
            }

        }catch (Exception ex){
            log.error("Exception while reading/write the data from file", ex);
        }
    }

}
