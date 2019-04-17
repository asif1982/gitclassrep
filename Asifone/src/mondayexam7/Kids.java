package mondayexam7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kids {
	WebDriver dr;
	Share s;
	Kids(WebDriver x){
		dr=x;
		s=new Share(dr);
	}
	public void getSizeOfKidsProduct() {
		int sizeOfKidsProduct=s.getSizeOfProduct(By.xpath(""));
		System.out.println(sizeOfKidsProduct);	
	}
	public void clickOnTodayDeal() {
		s.click(By.xpath(""));
	}
	public void clickonAmazonDevice() {
		s.click(By.xpath(""));
	}
	public boolean getvalueOfFristProduct() {
		String valueofFristProduct=s.getTextValue(By.xpath(""));
		String valueOfFirstProdut = null;
		//String valueOfFirstProdut = null;
		String valueTextWithoutDollerSing=valueOfFirstProdut.replace("$","");
		Double value=Double.parseDouble(valueTextWithoutDollerSing);
		boolean b=value>50;
		return b;
	}

}
