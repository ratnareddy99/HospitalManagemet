package com.hospital.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by extrrk on 12/11/2016.
 */
@Entity
public class Patient {

    @Override
    public String toString(){
        return this.name;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "ssn", nullable = false, unique = true)
    private Long ssn;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "radiograph_desc")
    private String radiographDesc;

    @Column(name = "reason_to_conduct")
    private String reasonToConduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getRadiographDesc() {
        return radiographDesc;
    }

    public void setRadiographDesc(String radiographDesc) {
        this.radiographDesc = radiographDesc;
    }

    public String getReasonToConduct() {
        return reasonToConduct;
    }

    public void setReasonToConduct(String reasonToConduct) {
        this.reasonToConduct = reasonToConduct;
    }

}
