package com.corejavaproject.serializableExample;

import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

@Log4j2
public class Student implements Serializable {
    public static final String COLLEGE_NAME = "CU";
    private int id;
    private String sName;
    private transient String sEmail;

    public Student(int id, String sName, String sEmail) {
        this.id = id;
        this.sName = sName;
        this.sEmail = sEmail;
    }

    public void getStudentDetails(){
        log.info("Student id is:{} and Student name is:{} and Student email is:{}", id, sName, sEmail);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", sEmail='" + sEmail + '\'' +
                '}';
    }
}
