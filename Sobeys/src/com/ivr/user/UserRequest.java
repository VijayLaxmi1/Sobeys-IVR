package com.ivr.user;

public class UserRequest {
/*	Input : {"rxNum":"dfge56"}
	Output : 
	{
	    "data": {
	        "storeId": "324fdsfsdf",
	        "patientId": "sf46",
	        "dob": "2017-03-1988",
	        "patFirstName": "dummy",
	        "patLastName": "text"
	    }
	}
	
	
	{
	"data":{
	"rx":
	{
	"isRefillable":true,
	"refillabilityMessage":"TEST",
	"refillabilityMessageQualifier":"TEST",
	"earliestRefillReadyDateValidUntil":"2019-01-04T11:08:56.821Z"
	}
	}
	}

	
	*/

	private String rxNum;

	public String getRxNum() {
		return rxNum;
	}

	public void setRxNum(String rxNum) {
		this.rxNum = rxNum;
	}
	
	
}
