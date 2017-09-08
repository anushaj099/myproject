package com.textile.model;
// Generated Apr 3, 2017 2:59:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Superviser generated by hbm2java
 */
public class Superviser  implements java.io.Serializable {


     private Integer ids;
     private String name;
     private Set parentQualities = new HashSet(0);

    public Superviser() {
    }

    public Superviser(String name, Set parentQualities) {
       this.name = name;
       this.parentQualities = parentQualities;
    }
   
    public Integer getIds() {
        return this.ids;
    }
    
    public void setIds(Integer ids) {
        this.ids = ids;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getParentQualities() {
        return this.parentQualities;
    }
    
    public void setParentQualities(Set parentQualities) {
        this.parentQualities = parentQualities;
    }




}

