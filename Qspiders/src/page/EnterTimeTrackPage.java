package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage{
	@FindBy(xpath="//div[contains(.,'Help')]")
	private WebElement help;
	@FindBy(linkText="About your actiTime")
	private WebElement aboutAT;
	@FindBy(css="span.productVersion")
	private WebElement version;
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeBTN;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	public EnterTimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickHelp(){
		help.click();
	}
	public void clickAboutActiTime(){
		aboutAT.click();
	}
	public void verifyVersion(String eText){
		verifyText(version,eText);
	}

	public void clickCloseButton(){
		closeBTN.click();
	}
	public void clickLogout(){
		logoutLink.click();
	}


}
