import java.net.HttpURLConnection;

import com.ivr.connection.HttpCon;
import com.ivr.prescription.LookupResponse;
import com.ivr.prescription.PrescriptionDetail;
import com.ivr.refill.Refill;
import com.ivr.refill.RefillResponse;
import com.ivr.util.ConfigReader;

public class AddRefill {

	
	public static void main(String args[])
	{
		String PRESC_REFILL_URL="";
	
		ConfigReader r=new ConfigReader();
		PRESC_REFILL_URL=r.getURL("P_REFILL");
        System.out.println(r.getURL("P_REFILL"));
        
        Refill rf=new Refill();
       // System.out.println(pd.CreateRequest());
        HttpCon hc=new HttpCon();
        HttpURLConnection hcon=hc.createConnectRefill(PRESC_REFILL_URL);
        
        String response=hc.readResponse(hcon);
      //  System.out.println(response);
        RefillResponse lr= rf.parseResponse(response);
        
        System.out.println("status : "+lr.getStatus());
        
	}
}
