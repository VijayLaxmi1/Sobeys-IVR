package com.ivr.refill;

import java.io.StringReader;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.ivr.prescription.LookupRequest;
import com.ivr.prescription.LookupResponse;
import com.ivr.prescription.Params;

public class Refill {

	
	JSONObject json=null;
	public String prescriptionLookup(){
		
		return null;
		
		
	}
	
	public JSONObject CreateRequest(){
		/*	Input : {"refillRxList":[
        {
                "rxNum":2467,
                "securityToken" : "fgdfgfdgdfgfd",
                "refillReadyDateType" : "gdfgfdgf",
                "refillReadyDateAbsoluteDateTime" : "2019-01-01",
                "refillReadyDateRelativeMinutesFromNow":987654320,
                "deliveryRouteType"     : "smnbfvdsd",
                "comment":"dskfjshfksdhfkjshfkjsdhfjsdhfkjsdhfj"
        }
],
"storeId" : "dfgthfghg5435",
"workOrderComment" : "sdgfjhukngbgf",
"callbackPhoneNumber" : "325468799"
}
*/
		
		RefillRxList rxl=new RefillRxList();
		rxl.setRxNum(2467);
		rxl.setSecurityToken("fgdfgfdgdfgfd");
		rxl.setRefillReadyDateType("gdfgfdgf");
		rxl.setRefillReadyDateAbsoluteDateTime("2019-01-01");
		rxl.setDeliveryRouteType("smnbfvdsd");
		rxl.setRefillReadyDateRelativeMinutesFromNow("987654320");
		rxl.setComment("dskfjshfksdhfkjshfkjsdhfjsdhfkjsdhfj");
		RefillRxList rfl[]=new RefillRxList[1];
		rfl[0]=rxl;
		RefillRequest rr=new RefillRequest();
		rr.setRx(rfl);
	rr.setStoreId("dfgthfghg5435");
	rr.setWorkOrderComment("sdgfjhukngbgf");		
	rr.setCallbackPhoneNumber("325468799");
	
	
	
	
		try {
			
			 json = new JSONObject(new Gson().toJson(rr, RefillRequest.class));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
		
		
	}
	
	
	public RefillResponse parseResponse(String response){
		
		StringReader reader = new StringReader(response.toString());
        Gson gson = new Gson();
        RefillResponse rr =  gson.fromJson(reader, RefillResponse.class);
		return rr;
		
		/*{
		isRefillable": true,
		    "refillabilityMessage": "string",
		    "refillabilityMessageQualifier": "string"
		"earliestRefillReadyDateValidUntil": "2018-08-30T20:15:00Z",

		}*/
	}
	
	

}
