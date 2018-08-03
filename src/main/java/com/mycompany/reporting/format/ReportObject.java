/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.reporting.format;

import java.util.Date;

import org.joda.time.DateTime;

public class ReportObject {

    private DateTime dateTime;

    private String ssn;
    private String firstName;
    private String secondName;
    private Date dob;
    
    private String firstLineAddress;
    private String secondLineAddress;
    private String postCode;
    private String city;
    private String country;

    private String userEventType;

	public DateTime getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstLineAddress() {
		return this.firstLineAddress;
	}

	public void setFirstLineAddress(String firstLineAddress) {
		this.firstLineAddress = firstLineAddress;
	}

	public String getSecondLineAddress() {
		return this.secondLineAddress;
	}

	public void setSecondLineAddress(String secondLineAddress) {
		this.secondLineAddress = secondLineAddress;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserEventType() {
		return this.userEventType;
	}

	public void setUserEventType(String userEventType) {
		this.userEventType = userEventType;
    }
    
    @Override
	public String toString() {
		return "{" +
			" dateTime='" + getDateTime() + "'" +
			", ssn='" + getSsn() + "'" +
			", firstName='" + getFirstName() + "'" +
			", secondName='" + getSecondName() + "'" +
			", dob='" + getDob() + "'" +
			", firstLineAddress='" + getFirstLineAddress() + "'" +
			", secondLineAddress='" + getSecondLineAddress() + "'" +
			", postCode='" + getPostCode() + "'" +
			", city='" + getCity() + "'" +
			", country='" + getCountry() + "'" +
			"}";
	}

}