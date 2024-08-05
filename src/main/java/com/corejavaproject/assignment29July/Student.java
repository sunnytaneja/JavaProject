package com.corejavaproject.assignment29July;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String emailId;
    private String course;

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
