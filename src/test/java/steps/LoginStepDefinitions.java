package steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DfwHomePage;
import pages.TestBase;

public class LoginStepDefinitions extends TestBase {
	
	DfwHomePage dfwHomepage;
	
	@Before
	public void beforeRun() {
		initDriver();
	 dfwHomepage = PageFactory.initElements(driver, DfwHomePage.class);
	}
	

	@Given("^user is on dfwAirport website$")
	public void  user_is_on_dfwAirport_website() throws InterruptedException {
	 driver.get("https://www.dfwairport.com/");
	dfwHomepage.acceptCookies();
	}

	@When("^user clicks park$") 
	public void user_clicks_park() throws InterruptedException {
		dfwHomepage.navigateToParkButton();
	}
	
	@Then("^user should see book and save parking form$")
	public void user_should_see_book_and_save_parking_form() throws IOException{
		String actualTitle = dfwHomepage.getPageTitle();
		String expectedTitle = "DFW International Airport | Parking";
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		takeScreenshot();
	} 
	
	@And("^user scrolls up and down$")
	public void user_scrolls_up_and_down() {
		dfwHomepage.checkBottomInfo();
	}
	
	@When("^user enters username as $")
	public void user_enters_username_as() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters password as $")
	public void user_enters_password_as() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@And ("^user clicks on signin button$")
	public void user_clicks_on_signin_button() {
		
	}
	@Then ("^user should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		
	}
	
	//@After
	public void afterRun() {
	tearDown();
	}


}

