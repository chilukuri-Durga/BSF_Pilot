package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "AccountContactsTabPageOnAccount", summary = "", relativeUrl = "", connection = "DRDProfile")
public class AccountContactsTabPageOnAccount {
	WebDriver driver;

	public AccountContactsTabPageOnAccount(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Account Contacts']")
	public WebElement accountContacts;

	@TextType()
	@FindByLabel(label = "Account Service Roles(1)")
	public WebElement accountServiceRoles1;

	@TextType()
	@FindBy(xpath = "//tr//th[@data-col-key-value='Contact__r.Name-forceLookup-2']/descendant::a//span[@id='window']")
	public WebElement ContactNameLink;

	@LinkType()
	@FindBy(xpath = "//slot//a[normalize-space(.)='ICJKYMATDTGI ICJKYMBBYZRC']//span[@id='window']")
	public WebElement ContactNameLink1;
	
	
	public void verifyContactNameLink(String firstName){
	
	driver.findElement(By.xpath("//span[contains(text(),'"+firstName+"') and @id='window']/ancestor::a"));
	
	}
	
	public void clickContactNameLink(String firstName){
	
	driver.findElement(By.xpath("//span[contains(text(),'"+firstName+"') and @id='window']/ancestor::a")).click();
	
	}

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View AllAccount Service Roles']")
	public WebElement viewAllAccountServiceRoles;

	@TextType()
	@FindBy(xpath = "//span[@id='window']/ancestor::a")
	public WebElement ContactNameLink2;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[@id='window']")
	public WebElement clickContactNameLink2;

	@TextType()
	@FindBy(xpath = "//table/tbody//a[contains(@class,'flex-wrap')]")
	public WebElement clickContactNameLink3;

}
