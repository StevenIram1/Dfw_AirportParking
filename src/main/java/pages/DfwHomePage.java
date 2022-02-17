package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DfwHomePage  {
	WebDriver driver;
	
	public DfwHomePage(WebDriver driver){
		
		this.driver = driver;
		}

	
	
	
	@FindBy(how = How.XPATH, using = "/html/body/reach-portal/div[3]/div/div/div/button")WebElement ACCEPT_BUTTON ;
	@FindBy(how = How.XPATH, using = "//span[text() ='Park']")WebElement PARK_BUTTON ;
	
	

	
	public void acceptCookies() {
		ACCEPT_BUTTON.click();
	}
	public void navigateToParkButton() {
		PARK_BUTTON.click();
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}
}

