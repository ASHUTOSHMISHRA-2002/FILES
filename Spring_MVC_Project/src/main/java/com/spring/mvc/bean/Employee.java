package com.spring.mvc.bean;

public class Employee {
    private int eid;       // Employee ID
    private String ename;  // Employee Name
    private double esalary;   // Employee Salary

    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsalary() {
        return esalary;
    }
    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }
}
