package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.MatualFund_HomePage;

public class Base {

	public WebDriver driver;

	// Object Creation for POM Pages

	public WebDriver intializeDriver() throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\nitin.singh.kushwah\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nitin.singh.kushwah\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {

		} else if (browserName.equals("IE")) {

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
