package com.readymix.model;
// Generated Sep 6, 2017 5:17:02 PM by Hibernate Tools 4.3.1



/**
 * Grades generated by hbm2java
 */
public class Grades  implements java.io.Serializable {


     private Integer gid;
     private String grade;

    public Grades() {
    }

    public Grades(String grade) {
       this.grade = grade;
    }
   
    public Integer getGid() {
        return this.gid;
    }
    
    public void setGid(Integer gid) {
        this.gid = gid;
    }
    public String getGrade() {
        return this.grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }




}


