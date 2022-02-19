package Tests;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseClass;
import page.Guru99Page;
import page.LoginPage;

public class TestCases extends BaseClass {
	public LoginPage lp;

	public TestCases() throws IOException {
		super();
	}

	@BeforeSuite
	private void setUp() throws IOException {
		initialization();

	}

	@BeforeMethod
	private void beforTest() throws IOException {
		lp = new LoginPage();
		PageFactory.initElements(driver, Guru99Page.class);

	}

	@Test(priority = 1)
	public void gotoLogin() throws Exception {
		lp.loginId("mngr387174", "Uvyvemy");
		Guru99Page.mangerid.isDisplayed();
		String text = Guru99Page.mangerid.getText();
		System.out.println(text);
	}

	@Test(priority =2 )
	public void deletcus() throws Exception {
		//lp.loginId("mngr387174", "Uvyvemy");
		Guru99Page.delectcustomerbtn.click();
		Thread.sleep(5000);
		Guru99Page.enderdeleteid.sendKeys("1234");
		Guru99Page.deletesubmitbtn.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
	}

	@Test(priority = 3)
	public void editcusid() throws Exception {
		// lp.loginId("mngr387174", "Uvyvemy");
		Guru99Page.gotoeditcustomer.click();
		Thread.sleep(5000);
		Guru99Page.editcustext.sendKeys("20042");
		Guru99Page.editcusbtn.click();
		Guru99Page.editlastsubmitbutton.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

	}

	@Test(priority = 4)
	public void logout() {
	 //driver.navigate().to("https://demo.guru99.com/v4/manager/Managerhomepage.php");
		Guru99Page.logoutbtn.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		System.out.println("You Have Succesfully Logged Out!!");
	
	}
	

}