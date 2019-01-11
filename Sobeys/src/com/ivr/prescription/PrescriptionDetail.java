package com.ivr.prescription;

import java.io.StringReader;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;


public class PrescriptionDetail {
	
	JSONObject json=null;
	public String prescriptionLookup(){
		
		return null;
		
		
	}
	
	public JSONObject CreateRequest(){
		/*	{
		  "storeId": "0077a42a-212b-4b1e-b3d1-1899079349e7",
		  "rxNum": 1234567,
		  "patLastName": "Smith",
		  "patBirthDate": "1967-08-30"
		}*/
		
		LookupRequest lr=new LookupRequest();
		lr.setStoreId("0077a42a-212b-4b1e-b3d1-1899079349e7");
		lr.setRxNum(1234567);
		lr.setPatLastName("Smith");
		lr.setPatBirthDate("1967-08-30");
	
		
		try {
			 json = new JSONObject(new Gson().toJson(lr, LookupRequest.class));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
		
		
	}
	
	
	public LookupResponse parseResponse(String response){
		
		StringReader reader = new StringReader(response.toString());
        Gson gson = new Gson();
        LookupResponse lR =  gson.fromJson(reader, LookupResponse.class);
		return lR;
		
		/*{
		isRefillable": true,
		    "refillabilityMessage": "string",
		    "refillabilityMessageQualifier": "string"
		"earliestRefillReadyDateValidUntil": "2018-08-30T20:15:00Z",

		}*/
	}
	
	

}
