package com.corejavaproject.variable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {

    // static variable
    public static final String COMPANY_NAME = "Google";

    // instance variable
    private final int employeeID = 123;
    private final String employeeDestination = "Software Engineer";

    public static void main(String[] args) {
        // invoke the static variable
        log.info(Employee.COMPANY_NAME);

        // create an object
        Employee employee =  new Employee();
        log.info(employee.employeeID);
        log.info(employee.employeeDestination);

        // local variable
        String address = "Bangalore";
        log.info(address);
    }
}
