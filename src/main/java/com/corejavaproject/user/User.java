package com.corejavaproject.user;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class User {

    // static variable
    public final static String COLLEGE_NAME = "SBI";
    public final static String COURSE_NAME = "MEDICAL";

    // instance variable
    private final int studentId;

    /**
     * Default constructor
     */
    public User(){
        log.info("#### Default Constructor  ###");
        this.studentId = 12;
    }

    /**
     * Parameterised constructor
     */
    public User(int mStudentId){
        log.info("#### Parameterised Constructor  ###");
        this.studentId = mStudentId;
    }

    /**
     * static method
     */
    public  static void getCollegeName(){
        log.info(COLLEGE_NAME);
    }

    /**
     * static method with return type
     */

    public static String getCollegeName1(){
        return COLLEGE_NAME;
    }

    /**
     * instance method with no return type
     */
    public void getCourseName(){
        log.info(COURSE_NAME);
    }

    public String getCourseName1(){
        return COURSE_NAME;
    }
    public static void main(String[] args) {
        User.getCollegeName();
        String collegeName = User.getCollegeName1();

        User user = new User(15);

        // instance variable call with object keyword
        user.getCourseName();
        String courseName = user.getCourseName1();
        log.info(COLLEGE_NAME);
        log.info(collegeName);
        log.info(user.studentId);
        log.info(courseName);
    }
}
