package com.ivr.user;

import com.ivr.prescription.Rx;

public class Data {

	/*Output : 
	{
	    "data": {
	        "storeId": "324fdsfsdf",
	        "patientId": "sf46",
	        "dob": "2017-03-1988",
	        "patFirstName": "dummy",
	        "patLastName": "text"
	    }
	}*/
	
private String storeId;
private String patientId;
private String dob;
private String patFirstName;
private String patLastName;
public String getStoreId() {
	return storeId;
}
public void setStoreId(String storeId) {
	this.storeId = storeId;
}
public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPatFirstName() {
	return patFirstName;
}
public void setPatFirstName(String patFirstName) {
	this.patFirstName = patFirstName;
}
public String getPatLastName() {
	return patLastName;
}
public void setPatLastName(String patLastName) {
	this.patLastName = patLastName;
}


}
