package org.pojo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdedefinition.Baseclass;

public class Locators extends Baseclass {
	public Locators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement txtemail;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement txtpassword;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement btnLogin;

	@FindBy(xpath="//span[2]/span")
	private WebElement msgInvalidUsername;
	
	public WebElement getMsgInvalidUsername() {
		return msgInvalidUsername;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
