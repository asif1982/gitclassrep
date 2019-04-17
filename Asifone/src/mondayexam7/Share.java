package mondayexam7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Share {
	
	
	WebDriver dr;
	Share(WebDriver x){
		dr=x;
	}
	public void type(By by,String text) {
		dr.findElement(by).sendKeys(text);
	}
	public void click(By by) {
		dr.findElement(by).click();
	}
	public int getSizeOfProduct(By by) {
		int s=dr.findElements(by).size();
		return s;
	}
	public String getTextValue(By by) {
		String text=dr.findElement(by).getText();
		return text;
	}

}
