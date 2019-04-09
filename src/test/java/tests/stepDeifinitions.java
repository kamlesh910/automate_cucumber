package tests;

import coreCode.ContactPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDeifinitions {
	ContactPage cp = new ContactPage();	

	@Given("^I navigate to AutomationTutorials$")
	public void i_navigate_to_AutomationTutorials() throws Throwable {
		System.out.println("started browser");
	}

	@Given("^click on \"([^\"]*)\" page$")
	public void click_on_page(String pageName) throws Throwable {
		cp.clickOnPage(pageName);
	}

	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_as(String controlName, String input) throws Throwable {
		cp.enterValueAtId(controlName, input);
	}

	@Then("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String buttonName) throws Throwable {
		cp.clickOnButton(buttonName);
	}

	@Then("^I close my browser$")
	public void i_close_my_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		cp.closeDriver();
	}
}
