package com.corejavaproject.assignment29July;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        StudentMain studentMain = new StudentMain();
        studentMain.createUserDetails(studentList);

//        // for ascending order with Comparable
//        Collections.sort(studentList, new StudentNameComparator());
//        log.info("Student Details with Student Name Comparator:{}", studentList);
//
//        // for ascending order with Comparator
//        Collections.sort(studentList, new StudentEmailComparator());
//        log.info("Student Details with Student Name Comparator:{}", studentList);

        // Comparator with Lambda
        studentList.sort(Comparator.comparing(Student::getName));
        log.info("Student Details with Student Name Comparator:{}", studentList);
    }

    public void createUserDetails(List<Student> stringListOfStudents) {
        Student student = new Student();
        student.setName("Sunny");
        student.setEmailId("sunny@gmail.com");
        student.setCourse("JAVA");

        Student student1 = new Student();
        student1.setName("Amit");
        student1.setEmailId("amit@gmail.com");
        student1.setCourse("Cpp");

        stringListOfStudents.add(student);
        stringListOfStudents.add(student1);
        log.info("Student Details with descending order:{}", stringListOfStudents);

        // for ascending order
        Collections.sort(stringListOfStudents);
        log.info("Student Details with ascending order:{}", stringListOfStudents);

        // for reverse oder with ascending order
        stringListOfStudents.sort(Collections.reverseOrder());
        log.info("Student Details with Reverse Ascending order:{}", stringListOfStudents);


        log.info("#########################");
        iterateUsingWithForLoop(stringListOfStudents);
        log.info("#########################");
        iterateUsingWithLambda(stringListOfStudents);
        log.info("#########################");
        iterateUsingWithForEachLoop(stringListOfStudents);
        log.info("#########################");
        iteratorWithIterator(stringListOfStudents);
        log.info("#########################");
        iteratorWithListOfIterator(stringListOfStudents);
    }

    public void iterateUsingWithLambda(List<Student> listOfStudent) {
        if (CollectionUtils.isNotEmpty(listOfStudent)) {
            listOfStudent.forEach(employee -> log.info("StudentName is:{} and Student EmailId is:{}", employee.getName(), employee.getEmailId()));
        }
    }

    public void iterateUsingWithForLoop(List<Student> listOfStudent) {
        if (CollectionUtils.isNotEmpty(listOfStudent)) {
            for (int i = 0; i < listOfStudent.size(); i++) {
                log.info("Iterator with For Loop:{}", listOfStudent.get(i));
            }
        }
    }

    public void iterateUsingWithForEachLoop(List<Student> listOfStudent) {
        if (CollectionUtils.isNotEmpty(listOfStudent)) {
            for (Student student : listOfStudent) {
                log.info("Iterator with For Each Loop:{}", student);
            }
        }
    }

    // it works only forward direction
    public void iteratorWithIterator(List<Student> studentList) {
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            log.info("Iterator with Iterator:{}", student);
        }
    }

    // it works forward and backward direction
    public void iteratorWithListOfIterator(List<Student> studentList) {
        ListIterator<Student> studentListIterator = studentList.listIterator();
        while (studentListIterator.hasNext()) {
            Student student = studentListIterator.next();
            log.info("Iterator with List Of Iterator With Forward Direction:{}", student);
        }
        log.info("#########################");

        while (studentListIterator.hasPrevious()) {
            Student student = studentListIterator.previous();
            log.info("Iterator with List Of Iterator With Backward Direction:{}", student);
        }
    }
}
