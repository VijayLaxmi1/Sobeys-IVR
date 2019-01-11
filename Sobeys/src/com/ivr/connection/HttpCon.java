package com.ivr.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.ivr.prescription.PrescriptionDetail;
import com.ivr.refill.Refill;
import com.ivr.user.UserDetail;



public class HttpCon {
	
	
	public HttpURLConnection createConnectUserDetail(String url){
		HttpURLConnection con=null;
		try {
			URL u=new URL(url);
			System.out.println("connection created");
			con= (HttpURLConnection) u.openConnection();
			System.out.println("connection created con");
    	    con.setRequestMethod("POST");
    		con.setDoOutput(true);
    		con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    		con.setRequestProperty("Accept", "application/json");
    		//createRequestURL(con,ob);
    		OutputStream os = con.getOutputStream();
    	
    		UserDetail ud=new UserDetail();
    	        System.out.println(ud.CreateRequest());     		
    	     os.write(ud.CreateRequest().toString().getBytes("UTF-8"));
    			
    		
    		int responseCode = con.getResponseCode();
    		System.out.println("Response Code : " + responseCode);
    		return con;
		}

	 catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally{
			return con;
		}
}
	
	public HttpURLConnection createConnectLookup(String url){
		HttpURLConnection con=null;
		try {
			URL u=new URL(url);	
			
		 con= (HttpURLConnection) u.openConnection();
		
    	    con.setRequestMethod("POST");
    		con.setDoOutput(true);
    		con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    		con.setRequestProperty("Accept", "application/json");
    		//createRequestURL(con,ob);
    		OutputStream os = con.getOutputStream();
    		
    			PrescriptionDetail pd=new PrescriptionDetail();
    	        System.out.println(pd.CreateRequest());     		
    	     os.write(pd.CreateRequest().toString().getBytes("UTF-8"));
    	
    		int responseCode = con.getResponseCode();
    		System.out.println("Testing " );
    		System.out.println("Response Code : " + responseCode);
    
		}

	 catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally{
			return con;
		}
}
	
	public HttpURLConnection createConnectRefill(String url){
		HttpURLConnection con=null;
		try {
			URL u=new URL(url);	
			
		 con= (HttpURLConnection) u.openConnection();
		
    	    con.setRequestMethod("POST");
    		con.setDoOutput(true);
    		con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    		con.setRequestProperty("Accept", "application/json");
    		//createRequestURL(con,ob);
    		OutputStream os = con.getOutputStream();
    		
    		Refill rf=new Refill();
    	        System.out.println(rf.CreateRequest());     		
    	     os.write(rf.CreateRequest().toString().getBytes("UTF-8"));
    	
    		int responseCode = con.getResponseCode();
    		System.out.println("Testing " );
    		System.out.println("Response Code : " + responseCode);
    
		}

	 catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally{
			return con;
		}
}

	
		
		
		public String readResponse(HttpURLConnection con){
			BufferedReader in;
			StringBuffer response = new StringBuffer();
			try {
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
    		String inputLine;
    	

    		while ((inputLine = in.readLine()) != null) {
    			response.append(inputLine);
    		}
    		System.out.println(response.toString());
    		
    		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			finally{
				return response.toString();
			}
		}
		

    		 
    		
    	

	

	

}
