package pages;

import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(how = How.XPATH, using = "//*[contains(@id,'ad')]")WebElement ARRIVALDATE_BUTTON;
	

	
	public void acceptCookies() throws InterruptedException {
		ACCEPT_BUTTON.click();
		Thread.sleep(3000);
	}
	public void navigateToParkButton() throws InterruptedException {
		PARK_BUTTON.click();
		Thread.sleep(3000);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void checkBottomInfo() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(o,200");
		js.executeScript("window.scroll(200,0");
	}
	
	public void clickArrivallDateBox() {
		ARRIVALDATE_BUTTON.click();
	}
	
}

