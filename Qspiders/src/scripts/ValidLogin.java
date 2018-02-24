package scripts;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{
	
	@Test(priority=1)
	public void testValidLogin(){
	String un=Excel.getData(XL_PATH, "ValidLogin", 1, 0);
	String pw=Excel.getData(XL_PATH, "ValidLogin", 1, 1);
	String eTitle=Excel.getData(XL_PATH, "ValidLogin", 1, 2);
	
	//Enter username
	LoginPage l=new LoginPage(driver);
	l.setName(un);
	//Enter password
	l.setPassword(pw);
	//click on LoginButton
	l.clickLogin();
	//verify that HomePage is Displayed
	WebDriverWait wait=new WebDriverWait(driver,30);
	try{
		wait.until(ExpectedConditions.titleContains(eTitle));
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyPageIsDisplayed(driver, "actiTIME-Time-Track");
	}catch(Exception e){
		
	}
	
	
}
}


