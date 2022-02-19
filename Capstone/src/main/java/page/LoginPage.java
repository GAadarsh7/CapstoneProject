package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass 
{
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement LoginButton;
	

	public LoginPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver,this);
		
	}
	
	public void loginId(String st, String str)throws Exception 
	{
		username.sendKeys(st);
		Thread.sleep(3000);
		password.sendKeys(str);
		Thread.sleep(3000);
		LoginButton.click();
		
	}

}