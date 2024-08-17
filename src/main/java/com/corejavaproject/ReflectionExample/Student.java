package com.corejavaproject.ReflectionExample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
@ToString
public class Student {

    private int rollNo;
    public String name;
    public String email;

    public Student(int rollNo, String name, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
    }

    private void callPrivateMethod() {
        log.info("Private Method Called");
    }

    public void callPublicMethod() {
        log.info("Public Method Called");
    }
}
