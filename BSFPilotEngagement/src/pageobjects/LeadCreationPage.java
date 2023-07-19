package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadCreationPage"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class LeadCreationPage {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Lead Source']/following-sibling::div//button[normalize-space(.)='General Referral']")
	public WebElement LeadSource;
	@FindBy(xpath = "//label[normalize-space(.)='Salutation']/following-sibling::div//button[normalize-space(.)='Dr.']")
	@TextType()
	public WebElement Salutation;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='First Name']/following-sibling::div//input")
	public WebElement FirstName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Last Name']/following-sibling::div//input")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Email']/following-sibling::div//input")
	public WebElement Email;
	@FindBy(xpath = "//label[text()='Phone']/parent::div[1]/descendant::input")
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
			
}
