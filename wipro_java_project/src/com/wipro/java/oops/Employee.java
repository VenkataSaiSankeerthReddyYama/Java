package com.wipro.java.oops;

/**
 * @author Sankeerth reddy
 *
 */
public class Employee {
    private int employee_no;
    private String name;
    private String emailID;
    private float salary; 

    // Getter for employee_no
    public int getEmployee_no() {
        return employee_no;
    }

    // Setter for employee_no
    public void setEmployee_no(int employee_no) {
        this.employee_no = employee_no;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for emailID
    public String getEmailID() {
        return emailID;
    }

    // Setter for emailID
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    // Getter for salary
    public float getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }
}