package com.corejavaproject.assignments;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;

@Log4j2
public class StudentDetails {
    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.getStudentDetails();
    }

    public void getStudentDetails() {

        Student student = new Student();
        student.setStudentName("Sunny");
        student.setStudentCourse("JavaFullStack");
        student.setCourseDuration("2 Months");

        Student student1 = new Student();
        student1.setStudentName("Amit");
        student1.setStudentCourse("React");
        student1.setCourseDuration("3 Months");

   /*     log.info("Student Name: {}", student.getStudentName());
        log.info("Student Course Name: {}", student.getStudentCourse());
        log.info("Student Course Duration: {}", student.getCourseDuration());

        log.info("Student Name1: {}", student1.getStudentName());
        log.info("Student Course Name1: {}", student1.getStudentCourse());
        log.info("Student Course Duration1: {}", student1.getCourseDuration());*/

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student);
        studentArrayList.add(student1);

        log.info(studentArrayList);
    }
}
