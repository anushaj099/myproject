package com.readymix.model;
// Generated Sep 6, 2017 5:17:02 PM by Hibernate Tools 4.3.1



/**
 * Gst generated by hbm2java
 */
public class Gst  implements java.io.Serializable {


     private Integer gstid;
     private String gstNumber;

    public Gst() {
    }

    public Gst(String gstNumber) {
       this.gstNumber = gstNumber;
    }
   
    public Integer getGstid() {
        return this.gstid;
    }
    
    public void setGstid(Integer gstid) {
        this.gstid = gstid;
    }
    public String getGstNumber() {
        return this.gstNumber;
    }
    
    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }




}


