import java.io.IOException;
import java.net.HttpURLConnection;
import com.ivr.connection.HttpCon;

import com.ivr.user.UserDetail;
import com.ivr.user.UserResponse;
import com.ivr.util.ConfigReader;

public class GetUserDetail {

	public static void main(String[] args) throws IOException {
	
		String PRESC_USER_URL="";
		
		ConfigReader r=new ConfigReader();
		PRESC_USER_URL=r.getURL("P_USERINFO");
        System.out.println(r.getURL("P_USERINFO"));
        
        UserDetail ud=new UserDetail();
      
        HttpCon hc=new HttpCon();
      
        HttpURLConnection hcon=hc.createConnectUserDetail(PRESC_USER_URL);
        
      System.out.println(hcon.getResponseCode());
        String response=hc.readResponse(hcon);
        UserResponse ur= ud.parseResponse(response);
        
        System.out.println(ur.getData().getPatFirstName());
        
        
	}

}
