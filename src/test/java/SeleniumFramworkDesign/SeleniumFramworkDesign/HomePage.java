package SeleniumFramworkDesign.SeleniumFramworkDesign;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Utils.SeleniumUtil;

import Resources.Base;
import pageObjects.MatualFund_HomePage;

public class HomePage extends Base {

	public String url;

	@Test
	public void basepageNavigation() throws IOException {

		driver = intializeDriver();

	//	String URL = SeleniumUtil.GetpropertyData(url);

		driver.get("https://money.rediff.com/index.html");

		M.MutualFunds_Menu_MutualFunds_Lnk.isDisplayed();

	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();
	}

}
