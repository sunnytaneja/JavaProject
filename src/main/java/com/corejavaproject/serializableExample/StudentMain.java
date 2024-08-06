package com.corejavaproject.serializableExample;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Log4j2
public class StudentMain {

    public static void main(String[] args) {

        String file = "D:\\CoreJavaProjects\\JavaProjectMainBranch\\JavaProject\\src\\main\\resources\\student.ser";

        Student student = new Student(1, "Sunny", "sunny@gmail.com");
        student.getStudentDetails();
        StudentMain studentMain = new StudentMain();
        studentMain.serialize(student, file);
        Student student1 = studentMain.deSerialize(file);
        log.info("Student Details is serialize:{}", student);
        log.info("Student Details is deSerialize:{}", student1);

    }

    public void serialize(Student student, String file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(student);

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public Student deSerialize(String file) {
        Student student = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            student = (Student) objectInputStream.readObject();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        return student;
    }
}
