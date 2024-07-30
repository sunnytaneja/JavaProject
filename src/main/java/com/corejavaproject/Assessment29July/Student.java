package com.corejavaproject.Assessment29July;

import lombok.extern.log4j.Log4j2;

import java.util.LinkedList;

@Log4j2
public class Student {
    LinkedList<String> studentData = new LinkedList<String>();
    public static void main(String[] args) {
        Student student = new Student();
        student.addInformation();
        log.info(student.studentData);
    }

    /**
     * method for add the data
     */
    public void addInformation() {
        studentData.add("Sunny");
        studentData.add("MCA");
        studentData.add("Pune");
        studentData.add("123");
        log.info(studentData);
    }


}
