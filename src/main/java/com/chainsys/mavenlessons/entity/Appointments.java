package com.chainsys.mavenlessons.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Appointments")
public class Appointments {
    @Id
    @Column(name = "APP_ID")
    private int id;

    @Column(name = "APP_DATE")
    private Date appointDate;

    @Column(name = "PATIENT_NAME")
    private String patientName;
    
    @Column(name = "DOC_ID ")
    private int docId;

    @Column(name = "FEES_COLLECTED")
    private float feesCollected;

    @Column(name = "FEES_CATOGORY")
    private String feesCatogory;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DOC_ID" , nullable = false,
	insertable = false ,updatable = false)
    @JsonIgnore
	private Doctor doctor;
	public Doctor getDoctor() {  
		return this.doctor;
	}
	public void setDoctor(Doctor doc) {
		this.doctor=doc;
	}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(Date appointDate) {
        this.appointDate = appointDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public float getFeesCollected() {
        return feesCollected;
    }

    public void setFeesCollected(float feesCollected) {
        this.feesCollected = feesCollected;
    }

    

    public String getFeesCatogory() {
		return feesCatogory;
	}
	public void setFeesCatogory(String feesCatogory) {
		this.feesCatogory = feesCatogory;
	}
	@Override
    public String toString() {
        return String.format("%d, %s, %s, %f, %s", id, appointDate, patientName, feesCollected, feesCatogory);
    }

}
