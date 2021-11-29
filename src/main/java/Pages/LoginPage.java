package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.DriverScript;

public class LoginPage extends DriverScript {

	@FindBy(id = "txtAgencyID") WebElement AgencyIDTbx;
	@FindBy(id = "txtLogin") WebElement EmailTbx;
	@FindBy(id = "txtPassword") WebElement PasswoodTbx;
	@FindBy(id = "btnLogin") WebElement LoginBtn;



	public void loginpage(){

		PageFactory.initElements(driver, this);
	}


	public void validatelogin(String AgencyID, String Email, String Password){

		AgencyIDTbx.sendKeys(AgencyID);
		EmailTbx.sendKeys(Email);
		PasswoodTbx.sendKeys(Password);
		LoginBtn.click();
	}
}
