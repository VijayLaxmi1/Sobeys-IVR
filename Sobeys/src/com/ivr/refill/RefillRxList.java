package com.ivr.refill;

public class RefillRxList {
	
	/*{"refillRxList":[
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
private int rxNum;
	public int getRxNum() {
	return rxNum;
}
public void setRxNum(int rxNum) {
	this.rxNum = rxNum;
}
	private String securityToken;
	private String refillReadyDateType;
	private String refillReadyDateAbsoluteDateTime;
	private String refillReadyDateRelativeMinutesFromNow;
	private String deliveryRouteType;
	private String comment;
	public String getSecurityToken() {
		return securityToken;
	}
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}
	public String getRefillReadyDateType() {
		return refillReadyDateType;
	}
	public void setRefillReadyDateType(String refillReadyDateType) {
		this.refillReadyDateType = refillReadyDateType;
	}
	public String getRefillReadyDateAbsoluteDateTime() {
		return refillReadyDateAbsoluteDateTime;
	}
	public void setRefillReadyDateAbsoluteDateTime(String refillReadyDateAbsoluteDateTime) {
		this.refillReadyDateAbsoluteDateTime = refillReadyDateAbsoluteDateTime;
	}
	public String getRefillReadyDateRelativeMinutesFromNow() {
		return refillReadyDateRelativeMinutesFromNow;
	}
	public void setRefillReadyDateRelativeMinutesFromNow(String refillReadyDateRelativeMinutesFromNow) {
		this.refillReadyDateRelativeMinutesFromNow = refillReadyDateRelativeMinutesFromNow;
	}
	public String getDeliveryRouteType() {
		return deliveryRouteType;
	}
	public void setDeliveryRouteType(String deliveryRouteType) {
		this.deliveryRouteType = deliveryRouteType;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
