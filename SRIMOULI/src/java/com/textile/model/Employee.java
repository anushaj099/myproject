package com.textile.model;
// Generated Apr 3, 2017 2:59:45 PM by Hibernate Tools 4.3.1



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private int empId;
     private String empName;
     private String designation;

    public Employee() {
    }

	
    public Employee(int empId) {
        this.empId = empId;
    }
    public Employee(int empId, String empName, String designation) {
       this.empId = empId;
       this.empName = empName;
       this.designation = designation;
    }
   
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }




}


