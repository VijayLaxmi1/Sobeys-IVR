package com.ivr.refill;

public class RefillResponse {
	
/*	{
		"status": "Success",
		"orderId": "24357"
		}
*/
	
	private String status;
	private String orderId;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}
