package com.corejavaproject.generics;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class StudentMain {

    public static void main(String[] args) {

        /**
         * for string type parameters
         */
        Student<String> stringStudent = new Student();
        stringStudent.setType("Generic Example");
        log.info("Student Name is:{}", stringStudent.getType());

        /**
         * for integer type parameters
         */

        Student<Integer> integerStudent = new Student<>();
        integerStudent.setType(1);
        log.info("Student Id is:{}", integerStudent.getType());
    }
}
