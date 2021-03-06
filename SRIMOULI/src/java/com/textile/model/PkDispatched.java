package com.textile.model;
// Generated Apr 1, 2017 10:42:24 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PkDispatched generated by hbm2java
 */
public class PkDispatched  implements java.io.Serializable {


     private Integer idk;
     private Date date;
     private String customer;
     private Integer count;
     private Float netWt;
     private String vehicleNo;
     private String bagSerialNo;
     private String lotNo;
     private Float weighingBridge;
     private String remarks;
     private String packingType;
     private Integer noOfBags;
     private Float expectedGrossWt;
     private String packingWeight;
     private Float extraYarnCent;
     private String tareWeight;

    public PkDispatched() {
    }

    public PkDispatched(Date date, String customer, Integer count, Float netWt, String vehicleNo, String bagSerialNo, String lotNo, Float weighingBridge, String remarks, String packingType, Integer noOfBags, Float expectedGrossWt, String packingWeight, Float extraYarnCent, String tareWeight) {
       this.date = date;
       this.customer = customer;
       this.count = count;
       this.netWt = netWt;
       this.vehicleNo = vehicleNo;
       this.bagSerialNo = bagSerialNo;
       this.lotNo = lotNo;
       this.weighingBridge = weighingBridge;
       this.remarks = remarks;
       this.packingType = packingType;
       this.noOfBags = noOfBags;
       this.expectedGrossWt = expectedGrossWt;
       this.packingWeight = packingWeight;
       this.extraYarnCent = extraYarnCent;
       this.tareWeight=tareWeight;
    }
   
    public Integer getIdk() {
        return this.idk;
    }
    
    public void setIdk(Integer idk) {
        this.idk = idk;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }
    public Float getNetWt() {
        return this.netWt;
    }
    
    public void setNetWt(Float netWt) {
        this.netWt = netWt;
    }
    public String getVehicleNo() {
        return this.vehicleNo;
    }
    
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    public String getBagSerialNo() {
        return this.bagSerialNo;
    }
    
    public void setBagSerialNo(String bagSerialNo) {
        this.bagSerialNo = bagSerialNo;
    }
    public String getLotNo() {
        return this.lotNo;
    }
    
    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }
    public Float getWeighingBridge() {
        return this.weighingBridge;
    }
    
    public void setWeighingBridge(Float weighingBridge) {
        this.weighingBridge = weighingBridge;
    }
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getPackingType() {
        return this.packingType;
    }
    
    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }
    public Integer getNoOfBags() {
        return this.noOfBags;
    }
    
    public void setNoOfBags(Integer noOfBags) {
        this.noOfBags = noOfBags;
    }
    public Float getExpectedGrossWt() {
        return this.expectedGrossWt;
    }
    
    public void setExpectedGrossWt(Float expectedGrossWt) {
        this.expectedGrossWt = expectedGrossWt;
    }
    public String getPackingWeight() {
        return this.packingWeight;
    }
    
    public void setPackingWeight(String packingWeight) {
        this.packingWeight = packingWeight;
    }
    public Float getExtraYarnCent() {
        return this.extraYarnCent;
    }
    
    public void setExtraYarnCent(Float extraYarnCent) {
        this.extraYarnCent = extraYarnCent;
    }

    public String getTareWeight() {
        return tareWeight;
    }

    public void setTareWeight(String tareWeight) {
        this.tareWeight = tareWeight;
    }




}


