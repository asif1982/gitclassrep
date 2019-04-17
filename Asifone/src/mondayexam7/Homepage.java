package mondayexam7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver dr;
	Share s;
	Homepage(WebDriver x){
		dr=x;
		s=new Share(dr);
	}
	public void typeOnSearchBox() {
		s.type(By.xpath(""),"kids");
	}
	public void clickOnSearchIcon() {
		s.click(By.xpath(""));
	}

}
