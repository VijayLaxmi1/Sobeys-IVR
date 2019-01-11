import com.ivr.prescription.LookupResponse;
import com.ivr.prescription.PrescriptionDetail;
import com.ivr.util.ConfigReader;

import java.net.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;

import com.ivr.connection.*;

public class TestLookup {
	
	public static void main(String args[])
	{
		String PRESC_LOOKUP_URL="";
	
		ConfigReader r=new ConfigReader();
		PRESC_LOOKUP_URL=r.getURL("P_LOOKUP");
        System.out.println(r.getURL("P_LOOKUP"));
        
        PrescriptionDetail pd=new PrescriptionDetail();
       // System.out.println(pd.CreateRequest());
        HttpCon hc=new HttpCon();
        HttpURLConnection hcon=hc.createConnectLookup(PRESC_LOOKUP_URL);
        
        String response=hc.readResponse(hcon);
      //  System.out.println(response);
        LookupResponse lr= pd.parseResponse(response);
        
        System.out.println("refillable : "+lr.getData().getRx().isRefillable());
        
	}	

}
