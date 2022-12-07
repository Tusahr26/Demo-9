package antitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AntiTimeLoginPage {
	//Decleration
	@FindBy(xpath="//input[@id='username']")
	private WebElement Un;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passw;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement Login;
	
	WebDriver driver;
	//Initialization
	public  AntiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Usage
	public void setActitimeUn()
	{
		Un.sendKeys("admin");
	}
	public void setActitimepassw()
	{
		passw.sendKeys("manager");
	}
	public void setActitimeLogin()
	{
		Login.click();
	}

}
