package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatualFund_HomePage {

	public WebDriver driver;

	public MatualFund_HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	//Menu Links of HomePage
	
	@FindBy(xpath = "//h2[text()='Top 25 mutual funds (annual)*']")
	public WebElement TopMutualFund;

	@FindBy(linkText = "Investment Tool")
	public WebElement MutualFunds_Menu_InvestmentTool_Lnk;

	@FindBy(linkText = "Forex")
	public WebElement MutualFunds_Menu_Forex_Lnk;

	@FindBy(linkText = "Indices")
	public WebElement MutualFunds_Menu_Indices_Lnk;

	@FindBy(linkText = "Sectors")
	public WebElement MutualFunds_Menu_Sectors_Lnk;

	@FindBy(xpath = "//a[text()='Mutual Funds']")
	public WebElement MutualFunds_Menu_MutualFunds_Lnk;

	@FindBy(linkText = "Gainers / Losers")
	public WebElement MutualFunds_Menu_GainerLosers_Lnk;

	@FindBy(linkText = "Import Portfolio")
	public WebElement MutualFunds_Menu_ImportPortfolio_Lnk;
	
	
}
