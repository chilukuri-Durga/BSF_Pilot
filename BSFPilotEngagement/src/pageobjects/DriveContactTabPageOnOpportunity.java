package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveContactTabPageOnOpportunity"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDProfile"
     )             
public class DriveContactTabPageOnOpportunity {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab2__item']")
	public WebElement driveContacts;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lst-related-list-single-aura-wrapper//a[@data-aura-class='forceOutputLookup']")
	public WebElement ContactName;
	@LinkType()
	@FindBy(xpath = "//a[contains(@title,'Add Drive Service Roles')]")
	public WebElement AddDriveServiceRolesBtn;
	@TextType()
	@FindBy(xpath = "//input[@title='Search Contacts']")
	public WebElement SearchContactInput;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement NextBtn;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit Role: Item 1']")
	public WebElement role;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Secondary Contact']")
	public WebElement selectsecondaryContact;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Primary Contact']")
	public WebElement ClickPrimaryRole;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "(//*[contains(@title,'Drive Service')])[1]")
	public WebElement DriveServiceRoleSec;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='A. Brooke Phelps']")
	public WebElement verifySecondarycontactName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span/span[normalize-space(.)='Primary Contact']")
	public WebElement VerifyPrimaryContact;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span/span[normalize-space(.)='Secondary Contact']")
	public WebElement secondarycontact;
			
}
