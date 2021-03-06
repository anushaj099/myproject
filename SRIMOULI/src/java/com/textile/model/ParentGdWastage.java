package com.textile.model;
// Generated Apr 3, 2017 2:59:45 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ParentGdWastage generated by hbm2java
 */
public class ParentGdWastage  implements java.io.Serializable {


     private Integer idw;
     private Date date;
     private String receiptNo;
     private Float totalBales;
     private Float totalWeight;
     private Set childGdWastages = new HashSet(0);

    public ParentGdWastage() {
    }

    public ParentGdWastage(Date date, String receiptNo, Float totalBales, Float totalWeight, Set childGdWastages) {
       this.date = date;
       this.receiptNo = receiptNo;
       this.totalBales = totalBales;
       this.totalWeight = totalWeight;
       this.childGdWastages = childGdWastages;
    }
   
    public Integer getIdw() {
        return this.idw;
    }
    
    public void setIdw(Integer idw) {
        this.idw = idw;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }
    
    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
    public Float getTotalBales() {
        return this.totalBales;
    }
    
    public void setTotalBales(Float totalBales) {
        this.totalBales = totalBales;
    }
    public Float getTotalWeight() {
        return this.totalWeight;
    }
    
    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }
    public Set getChildGdWastages() {
        return this.childGdWastages;
    }
    
    public void setChildGdWastages(Set childGdWastages) {
        this.childGdWastages = childGdWastages;
    }




}


