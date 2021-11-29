package TestCases;

import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.DriverScript;
import Pages.LoginPage;

public class LoginTestCase extends DriverScript {
	
	public LoginTestCase(){
		super();
	}
	
	Properties Prop;
	LoginPage LP;
	
	@BeforeMethod
	public void pretest(){
		initapp();
        LP = new LoginPage();
	}
	
	
	@Test
	public void Validatelogin(){
		
//		String AGID = prop.getProperty("AgencyID");
//		String EML = prop.getProperty("Email");
//		String PWD = prop.getProperty("Password");
		LP.validatelogin("DM00live", "siva@homecaresoftware.com", "Siva123");
		
	}
}
