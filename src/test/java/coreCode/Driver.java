package coreCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class Driver {
	public WebDriver driver;
	public FileHelper fh = new FileHelper();
	public Driver() {
		System.setProperty("webdriver.chrome.driver", "DriverExecutable/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webs.com/");
	}

	public void clickOnPage(String pageName) {
		driver.findElement(By.cssSelector("#webs-header-content > div > a")).click();
	}
	
	public void closeDriver() {
		driver.close();
	}

}
