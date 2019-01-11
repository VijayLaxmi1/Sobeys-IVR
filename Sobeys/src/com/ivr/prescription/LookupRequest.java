package com.ivr.prescription;

public class LookupRequest {
	
	
/*	 {
    "params":{
      "rxBarcode":"dfg4545wre",
      "storeId":"fste4etrt",
      "rxNum":3213123,
      "patLastName":"dsd dfdsfd",
      "patBirthDate":"s fsdf dfsdf",
      "rxSecurityToken":"fsdf4tegge5gfdg"
    }
  }
*/
	String storeId;
	int rxNum;
	String patLastName;
	String patBirthDate;
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public int getRxNum() {
		return rxNum;
	}
	public void setRxNum(int rxNum) {
		this.rxNum = rxNum;
	}
	public String getPatLastName() {
		return patLastName;
	}
	public void setPatLastName(String patLastName) {
		this.patLastName = patLastName;
	}
	public String getPatBirthDate() {
		return patBirthDate;
	}
	public void setPatBirthDate(String patBirthDate) {
		this.patBirthDate = patBirthDate;
	}



}
