package com.ivr.refill;

public class RefillRequest {

/*	
	{"refillRxList":[
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
}*/
	private RefillRxList[] refillRxList;
	private String storeId;
	private String workOrderComment;
	
	private String callbackPhoneNumber;
	public String getCallbackPhoneNumber() {
		return callbackPhoneNumber;
	}
	public void setCallbackPhoneNumber(String callbackPhoneNumber) {
		this.callbackPhoneNumber = callbackPhoneNumber;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getWorkOrderComment() {
		return workOrderComment;
	}
	public void setWorkOrderComment(String workOrderComment) {
		this.workOrderComment = workOrderComment;
	}
	public RefillRxList[] getRx() {
		return refillRxList;
	}
	public void setRx(RefillRxList[] refillRxList) {
		this.refillRxList = refillRxList;
	}
	
	


	
}
