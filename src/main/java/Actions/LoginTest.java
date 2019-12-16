package Actions;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage objLogin;
	HomePage objHomePage;

	@Test(priority = 0)
	public void test_Home_Page_Appear_Correct() {
		
		objLogin = new LoginPage(driver);

		// Verify login page title
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		
		// login to application
		objLogin.loginToGuru99("mgr123", "mgr!23");
		
		// go the next page
		objHomePage = new HomePage(driver);
		
		// Verify home page
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}

}
