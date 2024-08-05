package com.corejavaproject.assignment29July;

import java.util.Comparator;

public class StudentEmailComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getEmailId().compareTo(student2.getEmailId());
    }
}
