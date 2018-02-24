package generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.AutoUtil;
import generic.IAutoConst;

public class BasePage {
	public void verifyPageIsDisplayed(WebDriver driver,String eResult){
		String sETO=AutoUtil.getProperty(IAutoConst.CONFIG_PATH, "ETO");
		long ETO=Long.parseLong(sETO);
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		try{
			wait.until(ExpectedConditions.titleIs(eResult));
			Reporter.log("Pass: Expected Page is Displayed",true);
		}catch(Exception e){
			Reporter.log("Fail:Expected Page is not Displayed",true);
			Assert.fail();
		}
	}
	public void verifyText(WebElement e,String eText){
		String aText=e.getText();
		Assert.assertEquals(aText, eText);
	}
}
