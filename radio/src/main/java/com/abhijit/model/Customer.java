package com.abhijit.model;


import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

    @Id
    @Column
    String bbgID;
    @Column
    String dlrLEI;
    @Column
    String lei;
    @Column
    String name;
    @Column
    String oeID ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOeID() {
        return oeID;
    }

    public void setOeID(String oeID) {
        this.oeID = oeID;
    }

    public String getBbgID() {
        return bbgID;
    }

    public void setBbgID(String bbgID) {
        this.bbgID = bbgID;
    }

    public String getDlrLEI() {
        return dlrLEI;
    }

    public void setDlrLEI(String dlrLEI) {
        this.dlrLEI = dlrLEI;
    }

    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

}
