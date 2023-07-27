package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "ConvertedAccountPage", summary = "", relativeUrl = "", connection = "admin")
public class ConvertedAccountPage {

	WebDriver driver;

	public ConvertedAccountPage(WebDriver driver) {

		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Prospect']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Account_Status__c;

	@TextType()
	@FindBy(xpath = "//span[text()='Account Name']/ancestor::div[2]/descendant::lightning-formatted-text")
	public WebElement Name;

	@TextType()
	@FindBy(xpath = "(//span[text()='Lead Source']/ancestor::div[2]/descendant::lightning-formatted-text)[1]")
	public WebElement AccountSource;

	@TextType()
	@FindBy(xpath = "//span[text()='Account Type']/ancestor::div[2]/descendant::lightning-formatted-text")
	public WebElement Type;

	@TextType()
	@FindBy(xpath = "//span[text()='Business Phone Number']/ancestor::div[2]/descendant::a")
	public WebElement Phone;

	@TextType()
	@FindBy(xpath = "//span[text()='Industry Code']/ancestor::div[2]/descendant::lightning-formatted-text")
	public WebElement Industry_Code__c;

	@TextType()
	@FindBy(xpath = "//span[text()='Company Website']/ancestor::div[2]/descendant::a")
	public WebElement Website;

	@TextType()
	@FindBy(xpath = "//span[text()='Account Type From Lead']/ancestor::div[2]/descendant::lightning-formatted-text")
	public WebElement Account_Type_From_Lead__c;

	@TextType()
	@FindBy(xpath = "//span[text()='Total Company Size']/ancestor::div[2]/descendant::lightning-formatted-number")
	public WebElement Total_Company_Size__c;

	@TextType()
	@FindBy(xpath = "//span[text()='Account Record Type']/ancestor::div[2]/descendant::span[3]")
	public WebElement RecordTypeId;

	@ButtonType()
	@FindBy(name = "Edit")
	public WebElement Edit;

	
}