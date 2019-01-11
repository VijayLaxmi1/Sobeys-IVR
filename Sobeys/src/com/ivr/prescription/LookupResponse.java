package com.ivr.prescription;

import com.ivr.prescription.Data;

public class LookupResponse {
	
	/*{
		isRefillable": true,
		    "refillabilityMessage": "string",
		    "refillabilityMessageQualifier": "string"
		"earliestRefillReadyDateValidUntil": "2018-08-30T20:15:00Z",

		}*/
private Data data;

public Data getData() {
	return data;
}

public void setData(Data data) {
	this.data = data;
}

}
