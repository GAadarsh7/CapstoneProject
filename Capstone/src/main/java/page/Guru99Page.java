package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99Page 
{
	
	

	    @FindBy(xpath="//td[normalize-space()='Manger Id : mngr387060']")
	    public static WebElement mangerid;
	    
		//go to delete customer
		@FindBy(xpath="//*[text()='Delete Customer']")
		public static WebElement delectcustomerbtn;
		
		//delete cus id
		@FindBy(xpath="//input[@name='cusid']")
		public static WebElement enderdeleteid;
		
		//delete submit btn
		@FindBy(xpath="//input[@name='AccSubmit']")
		public static WebElement deletesubmitbtn;
		
		//for go to edit customer
		@FindBy(xpath="//a[text()='Edit Customer']")
		public static WebElement gotoeditcustomer;
		
		//edit customer id textbox
		@FindBy(xpath="//input[@name='cusid']")
		public static WebElement editcustext;
		
		//edit customer form submit button
		@FindBy(xpath="//input[@name='AccSubmit']")
		public static WebElement editcusbtn;
		
		@FindBy(xpath="//a[text()='Log out']")
		public static WebElement logoutbtn;
		
		@FindBy(xpath="//input[@name='sub']")
		public static WebElement editlastsubmitbutton;
		
		
}
