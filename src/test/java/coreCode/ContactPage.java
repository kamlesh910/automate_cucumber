package coreCode;

import org.openqa.selenium.By;

public class ContactPage extends Driver {
	public void enterValueAtId(String controlName, String input) {
		//String cn = fh.getProperty(controlName);
		driver.findElement(By.name(controlName)).sendKeys(input);
	}

	public void clickOnButton(String name) {
		driver.findElement(By.linkText(name)).click();
	}
}
