package com.readymix.model;
// Generated Jul 15, 2017 4:24:09 PM by Hibernate Tools 4.3.1



/**
 * ChCreditNote generated by hbm2java
 */
public class ChCreditNote  implements java.io.Serializable {


     private Integer slNo;
     private PrCreditNote prCreditNote;
     private String productDescription;
     private String hsnCode;
     private Float qty;
     private Float beforeTax;
     private Float afterTax;
     private Float rate;
     private Float amount;
     private Float taxableValue;
     private Float cgRate;
     private Float cgAmt;
     private Float sgRate;
     private Float sgAmt;
     private Float chTotal;

    public ChCreditNote() {
    }

	
    public ChCreditNote(PrCreditNote prCreditNote) {
        this.prCreditNote = prCreditNote;
    }
    public ChCreditNote(PrCreditNote prCreditNote, String productDescription, String hsnCode, Float qty, Float beforeTax, Float afterTax, Float rate, Float amount, Float taxableValue, Float cgRate, Float cgAmt, Float sgRate, Float sgAmt, Float chTotal) {
       this.prCreditNote = prCreditNote;
       this.productDescription = productDescription;
       this.hsnCode = hsnCode;
       this.qty = qty;
       this.beforeTax = beforeTax;
       this.afterTax = afterTax;
       this.rate = rate;
       this.amount = amount;
       this.taxableValue = taxableValue;
       this.cgRate = cgRate;
       this.cgAmt = cgAmt;
       this.sgRate = sgRate;
       this.sgAmt = sgAmt;
       this.chTotal = chTotal;
    }
   
    public Integer getSlNo() {
        return this.slNo;
    }
    
    public void setSlNo(Integer slNo) {
        this.slNo = slNo;
    }
    public PrCreditNote getPrCreditNote() {
        return this.prCreditNote;
    }
    
    public void setPrCreditNote(PrCreditNote prCreditNote) {
        this.prCreditNote = prCreditNote;
    }
    public String getProductDescription() {
        return this.productDescription;
    }
    
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getHsnCode() {
        return this.hsnCode;
    }
    
    public void setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
    }
    public Float getQty() {
        return this.qty;
    }
    
    public void setQty(Float qty) {
        this.qty = qty;
    }
    public Float getBeforeTax() {
        return this.beforeTax;
    }
    
    public void setBeforeTax(Float beforeTax) {
        this.beforeTax = beforeTax;
    }
    public Float getAfterTax() {
        return this.afterTax;
    }
    
    public void setAfterTax(Float afterTax) {
        this.afterTax = afterTax;
    }
    public Float getRate() {
        return this.rate;
    }
    
    public void setRate(Float rate) {
        this.rate = rate;
    }
    public Float getAmount() {
        return this.amount;
    }
    
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    public Float getTaxableValue() {
        return this.taxableValue;
    }
    
    public void setTaxableValue(Float taxableValue) {
        this.taxableValue = taxableValue;
    }
    public Float getCgRate() {
        return this.cgRate;
    }
    
    public void setCgRate(Float cgRate) {
        this.cgRate = cgRate;
    }
    public Float getCgAmt() {
        return this.cgAmt;
    }
    
    public void setCgAmt(Float cgAmt) {
        this.cgAmt = cgAmt;
    }
    public Float getSgRate() {
        return this.sgRate;
    }
    
    public void setSgRate(Float sgRate) {
        this.sgRate = sgRate;
    }
    public Float getSgAmt() {
        return this.sgAmt;
    }
    
    public void setSgAmt(Float sgAmt) {
        this.sgAmt = sgAmt;
    }
    public Float getChTotal() {
        return this.chTotal;
    }
    
    public void setChTotal(Float chTotal) {
        this.chTotal = chTotal;
    }




}


