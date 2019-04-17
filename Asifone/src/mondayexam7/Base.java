package mondayexam7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Base {
	
	WebDriver dr;
	public WebDriver openBrowser() {
		if (dr == null)
	}
	System.setProperty("webdriver.chrome.driver","\Users\asifzabed\Downloads\chromedriver_win32");
	dr = new ChromeDriver();
	dr.get("http://www.amazon.com");
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	return dr;
	 
		public void close() {
			dr.quit();
		}
}	
	

	


