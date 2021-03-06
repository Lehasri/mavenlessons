package com.chainsys.mavenlessons.entity;

import java.util.Date;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@Column(name = "DOC_ID")
	private int id;
	@Column(name = "NAME")
	private String docName;
	@Column(name = "DOB")
	private Date docDob;
	@Column(name = "SPECIALITY")
	private String speciality;
	@Column(name = "CITY")
	private String city;
	@Column(name = "PHONE_NO")
	private long phNo;
	@Column(name = "STANDARD_FEES")
	private int standard_fees;
	// @Joincolumn maps the column(Doc_ID) of the current Entity Appointment
	// with the PrimaryKey column(Id) of the associated Entity Doctor

	public int getStandard_fees() {
		return standard_fees;
	}

	public void setStandard_fees(int standard_fees) {
		this.standard_fees = standard_fees;
	}

	// Bidirectional Association
	@OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Appointments> appointments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Appointments> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointments> appointments) {
		this.appointments = appointments;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public Date getDocDob() {
		return docDob;
	}

	public void setDocDob(Date docDob) {
		this.docDob = docDob;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return String.format("{%d, %s, %s, %s,%d,%s}", id, docName, docDob, city,phNo,speciality);
	}

}
