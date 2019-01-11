import java.io.File;

import com.ivr.prescription.PrescriptionDetail;
import com.ivr.user.UserDetail;
import com.ivr.util.*;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//File f=new File("resources/Config.properties");
		ConfigReader r=new ConfigReader();
		r.getURL("P_LOOKUP");

System.out.println(r.getURL("P_LOOKUP"));


PrescriptionDetail pd=new PrescriptionDetail();
UserDetail ud=new UserDetail();

Object ob=pd;

if(ob  instanceof PrescriptionDetail )
	System.out.println("PrescriptionDetail");


	}

}
