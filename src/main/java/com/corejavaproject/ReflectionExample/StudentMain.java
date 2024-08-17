package com.corejavaproject.ReflectionExample;

import lombok.extern.log4j.Log4j2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Log4j2
public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student(1, "sunny", "sunny@gmail.com");

        Class studentClass = student.getClass();

        /**
         * access private variables
         */

        try {
            Field field = studentClass.getDeclaredField("rollNo");
            field.setAccessible(true);
            field.set(student, 2);
            log.info("Private variable is:{}", field.get(student));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        log.info("End of Private variable statement");

        log.info("###############################");
        /**
         * access public variable
         */

        Field publicField;
        try {
            publicField = studentClass.getDeclaredField("name");
            publicField.setAccessible(true);
            publicField.set(student, "Amit");
            log.info("Public variable is:{}", publicField.get(student));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        log.info("End of Public variable statement");

        log.info("###############################");

        /**
         * access private method
         */

        Method method;
        try {
            method = Student.class.getDeclaredMethod("callPrivateMethod");
            method.setAccessible(true);
            method.invoke(student);
            log.info("Private Method called:{}", student);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        log.info("End of Private Method statement");

        log.info("###############################");

        /**
         * access public method
         */

        Method publicMethod;
        try {
            publicMethod = Student.class.getDeclaredMethod("callPublicMethod");
            publicMethod.invoke(student);
            log.info("Public method called:{}", student);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        log.info("End of Public Method statement");

        log.info("###############################");

        /**
         * access the declare fields
         */
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            log.info("Declare Field is:{}", field.getName());
        }

        log.info("###############################");

        /**
         * access the declare methods
         */
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        for (Method method1 : declaredMethods) {
            log.info("Declare Method name is:{}", method1.getName());
        }

        log.info("###############################");

        /**
         * access the constructor
         */
        var constructors = studentClass.getDeclaredConstructors();
        for (var constructor : constructors) {
            log.info("Constructor called:{}", constructor.getName());
        }

    }
}
