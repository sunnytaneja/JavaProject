package com.corejavaproject.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    public static final String ORG_NAME = "Intel";

    private final int empId;
    private final String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public static void getOrgDetails(){
        log.info(ORG_NAME);
    }

    public static String getOrgDetails1(){
        return ORG_NAME;
    }

    public void getEmployeeId(){
        log.info(empId);
    }

    public String getEmpName(){
        return  empName;
    }

    public static void main(String[] args) {
        Employee.getOrgDetails();
        String orgName = Employee.getOrgDetails1();
        log.info(orgName);

        Employee employee  = new Employee(1, "Sunny");
        employee.getEmployeeId();
        String empName = employee.getEmpName();
        log.info(empName);
    }

}
