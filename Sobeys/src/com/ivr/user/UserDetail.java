package com.ivr.user;

import java.io.StringReader;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.ivr.prescription.LookupRequest;
import com.ivr.prescription.LookupResponse;

public class UserDetail {
	JSONObject json=null;
	public String prescriptionLookup(){
		
		return null;
		
		
	}
	
	public JSONObject CreateRequest(){
		/*	{
		 Input : {"rxNum":"dfge56"}
		}*/
		UserRequest uR=new UserRequest();
	uR.setRxNum("dfge56");
		
		try {
			 json = new JSONObject(new Gson().toJson(uR, UserRequest.class));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
		
		
	}
	
	
	public UserResponse parseResponse(String response){
		
		StringReader reader = new StringReader(response.toString());
        Gson gson = new Gson();
      
        UserResponse lR =  gson.fromJson(reader, UserResponse.class);
		return lR;
		
		/*{
		isRefillable": true,
		    "refillabilityMessage": "string",
		    "refillabilityMessageQualifier": "string"
		"earliestRefillReadyDateValidUntil": "2018-08-30T20:15:00Z",

		}*/
	}
	
	

}
