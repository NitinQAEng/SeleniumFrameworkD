package SeleniumFramworkDesign.SeleniumFramworkDesign;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Resources.Base;
import pageObjects.MatualFund_HomePage;

public class HomePage extends Base {

	public String url;

	@Test
	public void basepageNavigation() throws IOException, InterruptedException {

		driver = intializeDriver();

		MatualFund_HomePage M = new MatualFund_HomePage(driver);

		// String URL = SeleniumUtil.GetpropertyData(url);

		driver.get("https://money.rediff.com/index.html");

		Thread.sleep(10000);

		M.MutualFunds_Menu_Forex_Lnk.click();

		List<WebElement> WL = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
//
//		Iterator<WebElement> it = WL.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next().getText());
//
//		}
		
		

	}

	@AfterMethod
	public void closeBrowser() {

		// driver.close();
	}

}
