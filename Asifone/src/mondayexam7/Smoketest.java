package mondayexam7;

import org.openqa.selenium.WebDriver;

public class Smoketest {

	public static void main(String[] args) {
		Base b=new Base();
		WebDriver dr=b.openBrowser();
		Homepage h=new Homepage(dr);
		h.typeOnSearchBox();
		h.clickOnSearchIcon();
		Kids k=new Kids(dr);
		k.clickOnTodayDeal();
		k.clickonAmazonDevice();
		k.getSizeOfKidsProduct();
		b.close();
		
		
		
		

	}

}
