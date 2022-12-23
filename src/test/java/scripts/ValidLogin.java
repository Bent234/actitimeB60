package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.BaseTest;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest {

	@Test(priority = 1)
	public void testValidLogin(){
//		1. Enter valid user name
		LoginPage loginPage=new LoginPage(driver,test);
		loginPage.setUserName("admin");
		
//		2. Enter valid password
		loginPage.setPassword("manager");
	
//		3. click on login button
		loginPage.clickLoginButton();
		
//		4. verify home page is displayed
		EnterTimeTrackPage ettPage=new EnterTimeTrackPage(driver,test);
		boolean result = ettPage.verifyHomePageIsDisplayed(wait);
		Assert.assertTrue(result,"Home Page is not displayed");
	}
}
