package com.textile.model;
// Generated Apr 3, 2017 2:59:45 PM by Hibernate Tools 4.3.1



/**
 * PackerName generated by hbm2java
 */
public class PackerName  implements java.io.Serializable {


     private Integer idn;
     private String packerName;

    public PackerName() {
    }

    public PackerName(String packerName) {
       this.packerName = packerName;
    }
   
    public Integer getIdn() {
        return this.idn;
    }
    
    public void setIdn(Integer idn) {
        this.idn = idn;
    }
    public String getPackerName() {
        return this.packerName;
    }
    
    public void setPackerName(String packerName) {
        this.packerName = packerName;
    }




}


