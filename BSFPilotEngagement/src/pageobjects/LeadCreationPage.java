package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "LeadCreationPage", summary = "", relativeUrl = "", connection = "admin")
public class LeadCreationPage {

	WebDriver driver;

	public LeadCreationPage(WebDriver driver) {

		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Lead Source']/following-sibling::div//button[normalize-space(.)='General Referral']")
	public WebElement LeadSource;

	@FindBy(xpath = "//label[normalize-space(.)='Salutation']/following-sibling::div//button[normalize-space(.)='Dr.']")
	@TextType()
	public WebElement Salutation;

	@TextType()
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement FirstName;

	@TextType()
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement LastName;

	@TextType()
	@FindBy(xpath = "//input[@name='Email']")
	public WebElement Email;

	@FindBy(xpath = "//input[@name='Phone']")
	@TextType()
	public WebElement Phone;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Phone Type']/following-sibling::div//button")
	public WebElement Phone_Type__c;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Company']/following-sibling::div//input")
	public WebElement Company;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Account Type']/following-sibling::div//button")
	public WebElement Account_Type__c;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Total Company Size']/following-sibling::div//input")
	public WebElement Total_Company_Size__c;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Industry Code']/following-sibling::div//button")
	public WebElement Industry_Code__c;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Website']/following-sibling::div//input")
	public WebElement Website;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Street']/following-sibling::div//textarea")
	public WebElement Street;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='City']/following-sibling::div//input")
	public WebElement City;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='State/Province']/following-sibling::div//input")
	public WebElement StateCode;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Zip/Postal Code']/following-sibling::div//input")
	public WebElement PostalCode;

	@TextType()
	@FindByLabel(label = "Has Personal Story")
	public WebElement Has_Personal_Story__c;

	@TextType()
	@FindByLabel(label = "Lead Source")
	public WebElement LeadSource1;

	@TextType()
	@FindByLabel(label = "Salutation")
	public WebElement Salutation1;

	@NumericType(decimalPlaces = 2, length = 10)
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement Save;

	@TextType()
	@FindByLabel(label = "Phone Type")
	public WebElement Phone_Type__c1;
	
	public void EnterLeadDetils(){
	
	
	
	}
	
	

	public void selectLeadSource(String LeadSource) {
		driver.findElement(By.xpath("//button[@aria-label='Lead Source, --None--']")).click();

		List<WebElement> allOptions1 = driver.findElements(By.xpath("//lightning-base-combobox-item"));

		for (int i = 0; i < allOptions1.size(); i++) {

			if (allOptions1.get(i).getAttribute("data-value").contains(LeadSource)) {
				allOptions1.get(i).click();
				System.out.println("clicked");
			}
		}
	}

	public void selectSalutation(String Salutation) {
		driver.findElement(By.xpath("//label[contains(text(),'Salutation')]/parent::lightning-combobox/descendant::button")).click();

		List<WebElement> allOptions1 = driver.findElements(By.xpath("//lightning-base-combobox-item//span[@class='slds-truncate']"));

		for (int i = 0; i < allOptions1.size(); i++) {

			if (allOptions1.get(i).getText().contains(Salutation)) {
				allOptions1.get(i).click();
				System.out.println("clicked");
			}
		}
	}

	public void selectPhoneType(String PhoneType) {
		driver.findElement(By.xpath("//label[contains(text(),'Phone Type')]/parent::lightning-combobox/descendant::button")).click();

		List<WebElement> allOptions1 = driver.findElements(By.xpath("//lightning-base-combobox-item//descendant::span[@class='slds-truncate']"));

		for (int i = 0; i < allOptions1.size(); i++) {

			if (allOptions1.get(i).getText().contains(PhoneType)) {
				allOptions1.get(i).click();
				System.out.println("clicked");
			}
		}
	}

	public void selectAccountType(String AccountType) {

		driver.findElement(By.xpath("//button[@aria-label='Account Type, --None--']")).click();

		List<WebElement> allOptions1 = driver.findElements(By.xpath("//lightning-base-combobox-item"));

		for (int i = 0; i < allOptions1.size(); i++) {

			if (allOptions1.get(i).getAttribute("data-value").contains(AccountType)) {
				allOptions1.get(i).click();
				System.out.println("clicked");
			}
		}
	}

	public void selectIndustryCode(String IndustryCode) {

		driver.findElement(By.xpath("//button[@aria-label='Industry Code, --None--']")).click();

		List<WebElement> allOptions1 = driver.findElements(By.xpath("//lightning-base-combobox-item"));

		for (int i = 0; i < allOptions1.size(); i++) {

			if (allOptions1.get(i).getAttribute("data-value").contains(IndustryCode)) {
				allOptions1.get(i).click();
				System.out.println("clicked");
			}
		}
	}

}
