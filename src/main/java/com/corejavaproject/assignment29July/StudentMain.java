package com.corejavaproject.assignment29July;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {
        List<Student> employees = new ArrayList<>();
        StudentMain studentMain = new StudentMain();
        studentMain.createUserDetails(employees);
    }

    public void createUserDetails(List<Student> stringList) {
        Student student = new Student();
        student.setName("Sunny");
        student.setEmailId("sunny@gmail.com");
        student.setCourse("JAVA");

        Student student1 = new Student();
        student1.setName("Amit");
        student1.setEmailId("amit@gmail.com");
        student1.setCourse("Cpp");

        stringList.add(student);
        stringList.add(student1);
        log.info("Student Details with descending order:{}", stringList);

        // for ascending order
        Collections.sort(stringList);
        log.info("Student Details with ascending order:{}", stringList);

        // for reverse oder with ascending order
        stringList.sort(Collections.reverseOrder());
        log.info("Student Details with Reverse Ascending order:{}", stringList);

        iterateUsingWithLambda(stringList);
    }

    public void iterateUsingWithLambda(List<Student> listOfStudent) {
        if (CollectionUtils.isNotEmpty(listOfStudent)) {
            listOfStudent.forEach(employee -> log.info("StudentName is:{} and Student EmailId is:{}", employee.getName(), employee.getEmailId()));
        }
    }
}
