package com.ivr.prescription;

public class Rx {

	/*{
		"data":{
		"rx":
		{
		"isRefillable":true,
		"refillabilityMessage":"TEST",
		"refillabilityMessageQualifier":"TEST",
		"earliestRefillReadyDateValidUntil":"2019-01-04T11:08:56.821Z"
		}
		}
		}*/

	private boolean  isRefillable;
	private String refillabilityMessage;
	private String refillabilityMessageQualifier;
	private String earliestRefillReadyDateValidUntil;
	
	public boolean isRefillable() {
		return isRefillable;
	}
	public void setRefillable(boolean isRefillable) {
		this.isRefillable = isRefillable;
	}
	public String getRefillabilityMessage() {
		return refillabilityMessage;
	}
	public void setRefillabilityMessage(String refillabilityMessage) {
		this.refillabilityMessage = refillabilityMessage;
	}
	public String getRefillabilityMessageQualifier() {
		return refillabilityMessageQualifier;
	}
	public void setRefillabilityMessageQualifier(String refillabilityMessageQualifier) {
		this.refillabilityMessageQualifier = refillabilityMessageQualifier;
	}
	public String getEarliestRefillReadyDateValidUntil() {
		return earliestRefillReadyDateValidUntil;
	}
	public void setEarliestRefillReadyDateValidUntil(String earliestRefillReadyDateValidUntil) {
		this.earliestRefillReadyDateValidUntil = earliestRefillReadyDateValidUntil;
	}
	
	
	
}
