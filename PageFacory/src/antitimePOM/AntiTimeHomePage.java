package antitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AntiTimeHomePage {
	//Decleration
	


         //-----Demo-9--Succesfully




	@FindBy(xpath="//img[@height='61']")
	private WebElement Logo;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement Logout;
	WebDriver driver;
	
	//Initialization
	public AntiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Usage
	public void setActitimeLogo()
	{
		boolean l = Logo.isDisplayed();
		if(l==true)
		{
			System.out.println("Test is Pass" +l);
		}
		else
		{
			System.out.println("Test is Faild "+l);
		}
			
	}
	public void setActitimeLogout()
	{
		Logout.click();
	}

}
