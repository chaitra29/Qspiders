package scripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest{

	@Test(priority=2)
	public void testInValid(){
		String un=Excel.getData(XL_PATH, "InValidLogin", 1, 0);
		String pw=Excel.getData(XL_PATH, "InValidLogin", 1, 1);
		String msg=Excel.getData(XL_PATH, "InValidLogin", 1, 2);

		//Enter invalid username
		LoginPage l=new LoginPage(driver);
		l.setName(un);
		//Enter invalid password
		l.setPassword(pw);
		//click login
		l.clickLogin();
		//verify error message
		l.VerifyErrMsg(msg);
	}
}
