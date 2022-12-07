package antitimeTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import antitimePOM.AntiTimeHomePage;
import antitimePOM.AntiTimeLoginPage;

public class AntiTimeTest {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    driver.manage().window().maximize();
	    AntiTimeLoginPage n = new AntiTimeLoginPage (driver);
	    Thread.sleep(2000);
	    n.setActitimeUn();
	    n.setActitimepassw();
	    n.setActitimeLogin();
	    Thread.sleep(2000);
	    AntiTimeHomePage h = new AntiTimeHomePage (driver);
	    h.setActitimeLogo();
	    h.setActitimeLogout();
	    Thread.sleep(2000);
	    
	    		driver.close();
	    	
	    		
	}

}
