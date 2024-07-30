package com.corejavaproject.variable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {

    // static variable
    public final static String COLLEGE_NAME = "NIT";

    // instance variable
    public final int studentID = 123;
    public final String studentEmail = "sunny@gmail.com";

    public static void main(String[] args) {
        log.info(Student.COLLEGE_NAME);

        // create an object
        Student student = new Student();
        log.info(student.studentEmail);
        log.info(student.studentID);

        // local variable

        int phoneNumber = 1234567890;
        log.info(phoneNumber);
    }

}
