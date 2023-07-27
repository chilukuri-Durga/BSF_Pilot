package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.*;

@Page(title = "PlanADrivePageOnAccount", summary = "", relativeUrl = "", connection = "DRDProfile")
public class PlanADrivePageOnAccount {
	WebDriver driver;

	public PlanADrivePageOnAccount(WebDriver driver) {

		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Account.Plan_a_Mobile_Drive']")
	public WebElement Account_Plan_a_Mobile_Drive;

	@FindBy(xpath = "//input[@name='Select_AccountSite']/ancestor::div[1]/descendant::label")
	@TextType()
	public WebElement selectSite;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='Matching_Templates']")
	public WebElement MatchingTemplates;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next1;

	@TextType()
	@FindBy(xpath = "//input[@name='Drive_Date']")
	public WebElement driveDate;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='FlowStartTimePicklist']")
	public WebElement StartTime;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='FlowEndTimePicklist']")
	public WebElement EndTime;

	@TextType()
	@FindBy(xpath = "//input[@name='Whole_Blood_Procedures1']")
	public WebElement wholeBloodProcedures;

	@TextType()
	@FindBy(xpath = "//input[@name='Double_Red_Procedures']")
	public WebElement doubleRedProcedures;

	@TextType()
	@FindBy(xpath = "//input[@name='Anticipated_Registered_Donors']")
	public WebElement anticipatedRegisteredDonors;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='Open_To_Public_Updated']")
	public WebElement OpenToPublic;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='OnlineSchedulingEnabled2']")
	public WebElement OnlineSchedulingEnabled;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p[normalize-space(.)='Inside']")
	public WebElement DriveType;

	@TextType()
	@FindBy(xpath = "//input[@name='Drive_Keyword']")
	public WebElement driveKeyword;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next2;

	@TextType()
	@FindBy(xpath = "//input[@name='Targeted_Ask_Date']")
	public WebElement targetAskDate;
	
	@TextType()
	@FindBy(xpath = "//input[@name='Close_Date']")
	public WebElement closedDate;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next3;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next4;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p/span[normalize-space(.)='The Opportunity record was successfully created.']")
	public WebElement CheckPlanDriveCreated_;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Finish']")
	public WebElement finish;

	public void selectTemplate() {

		Select matchTemplate = new Select(driver.findElement(By.xpath("//select[@name='Matching_Templates']")));
		matchTemplate.selectByValue("TemplateChoiceSet.1");
	}

	public void deselect56Daysviolation() {

		WebElement dayscheck = driver.findElement(
				By.xpath("//span[contains(text(),'Accept 56 Day Rule Violation')]/ancestor::div[2]/descendant::label"));
		dayscheck.click();
	}

	public void verify56daysviolation() {
		WebElement violationMsg = driver
				.findElement(By.xpath(")//span[contains(text(),'This error occurred when the flow tried to create records: FIELD_CUSTOM_VALIDATION_EXCEPTION: This drive date violates the 56 day rule.Please acknowledge.. You can look up ExceptionCode values in the ')]"));

      String note=violationMsg.getText().trim();
		if (note.contains("This error occurred when the flow tried to create records: FIELD_CUSTOM_VALIDATION_EXCEPTION: This drive date violates the 56 day rule")) {

			System.out.println("56 days violation pass");

		} else {
			System.out.println("56 days violation fail");
		}

	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='This error occurred when the flow tried to create records: FIELD_CUSTOM_VALIDATION_EXCEPTION: This drive date violates the 56 day rule.Please acknowledge.. You can look up ExceptionCode values in the SOAP API Developer Guide.']")
	public WebElement _6DaysViolationRule;

	@TextType()
	@FindBy(xpath = "//input[@name='Targeted_Ask_Date']")
	public WebElement pickAYear;
	
	@TextType()
	@FindBy(xpath = "//h2[contains(text(),'Plan a Drive')]")
	public WebElement planadrive;
	
	public void selectTargetDate(String Date){
	
	
	driver.findElement(By.xpath("//input[@name='Targeted_Ask_Date']")).sendKeys(Date);
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[@id='input-error-2-2108']/lightning-formatted-rich-text/span")
	public WebElement pickAYeartarget;

}
