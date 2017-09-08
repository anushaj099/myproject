package com.textile.model;
// Generated Apr 3, 2017 2:59:45 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * StockReportReal generated by hbm2java
 */
public class StockReportReal  implements java.io.Serializable {


     private Integer ids;
     private Date date;
     private String variety;
     private Float receivedQuantity;
     private Float receivedKgs;
     private Float issueQuantity;
     private Float issueKgs;
     private Float stockQuantity;
     private Float stockKgs;

    public StockReportReal() {
    }

    public StockReportReal(Date date, String variety, Float receivedQuantity, Float receivedKgs, Float issueQuantity, Float issueKgs, Float stockQuantity, Float stockKgs) {
       this.date = date;
       this.variety = variety;
       this.receivedQuantity = receivedQuantity;
       this.receivedKgs = receivedKgs;
       this.issueQuantity = issueQuantity;
       this.issueKgs = issueKgs;
       this.stockQuantity = stockQuantity;
       this.stockKgs = stockKgs;
    }
   
    public Integer getIds() {
        return this.ids;
    }
    
    public void setIds(Integer ids) {
        this.ids = ids;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getVariety() {
        return this.variety;
    }
    
    public void setVariety(String variety) {
        this.variety = variety;
    }
    public Float getReceivedQuantity() {
        return this.receivedQuantity;
    }
    
    public void setReceivedQuantity(Float receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }
    public Float getReceivedKgs() {
        return this.receivedKgs;
    }
    
    public void setReceivedKgs(Float receivedKgs) {
        this.receivedKgs = receivedKgs;
    }
    public Float getIssueQuantity() {
        return this.issueQuantity;
    }
    
    public void setIssueQuantity(Float issueQuantity) {
        this.issueQuantity = issueQuantity;
    }
    public Float getIssueKgs() {
        return this.issueKgs;
    }
    
    public void setIssueKgs(Float issueKgs) {
        this.issueKgs = issueKgs;
    }
    public Float getStockQuantity() {
        return this.stockQuantity;
    }
    
    public void setStockQuantity(Float stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public Float getStockKgs() {
        return this.stockKgs;
    }
    
    public void setStockKgs(Float stockKgs) {
        this.stockKgs = stockKgs;
    }




}

