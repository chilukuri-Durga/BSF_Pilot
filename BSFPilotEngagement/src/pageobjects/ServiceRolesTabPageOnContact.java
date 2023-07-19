package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "ServiceRolesTabPageOnContact", summary = "", relativeUrl = "", connection = "DRDProfile")
public class ServiceRolesTabPageOnContact {

	WebDriver driver;

	public ServiceRolesTabPageOnContact(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Service Roles']")
	public WebElement serviceRoles;

	@TextType()
	@FindBy(xpath = "//th[@data-label='Account']/descendant::a//span")
	public WebElement AccountNameOnServiceRole;

	public void clickAccountNameOnServiceRole_Contact(){
	
            driver.findElement(By.xpath("//th[@data-label='Account']/descendant::a//span"));
	
	}

	@TextType()
	@FindBy(xpath = "//span[@id='window']/ancestor::a")
	public WebElement clickAccountNameOnServiceRole;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View AllAccount Service Roles']")
	public WebElement viewAllAccountServiceRoles;

	@TextType()
	@FindBy(xpath = "//table/tbody//a[contains(@class,'flex-wrap')]")
	public WebElement AccountNameOnServiceRole1;
	
	
	
			
}
