package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.*;

@Page(title = "CreateTemplatePage", summary = "", relativeUrl = "", connection = "DRDProfile")
public class CreateTemplatePage {
	WebDriver driver;

	public CreateTemplatePage(WebDriver driver) {

		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Account.Create_a_Template']")
	public WebElement CreateATemplate;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span/lightning-formatted-rich-text/span")
	public WebElement selectSite;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;

	@TextType()
	@FindBy(xpath = "//input[@name='Whole_Blood_Procedures1']")
	public WebElement wholeBloodProcedures;

	@TextType()
	@FindBy(xpath = "//input[@name='Double_Red_Procedures']")
	public WebElement doubleRedProcedures;

	@TextType()
	@FindBy(xpath = "//input[@name='Anticipated_Registered_Donors']")
	public WebElement anticipatedRegisteredDonors;

	@TextType()
	@FindBy(xpath = "//input[@name='Drive_Keyword']")
	public WebElement driveKeyword;

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label/span[1]")
	public WebElement Accept56DaysRuleViolation;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next1;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next2;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//p/span[normalize-space(.)='The Opportunity record was successfully created.']")
	public WebElement checkTemplateIsCreated;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Finish']")
	public WebElement finish;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*']/following-sibling::div//select[@name='FlowStartTimePicklist']")
	public WebElement StartTime;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*']/following-sibling::div//select[@name='FlowEndTimePicklist']")
	public WebElement EndTime;

	public void selectStartTime(String StartTime) {
		Select startTime = new Select(driver.findElement(By.xpath("//select[@name='FlowStartTimePicklist']")));
		startTime.selectByVisibleText(StartTime);

	}

	public void selectEndTime(String endTime) {
		Select EndTime = new Select(driver.findElement(By.xpath("//select[@name='FlowEndTimePicklist']")));
		EndTime.selectByVisibleText(endTime);

	}

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='FlowStartTimePicklist']")
	public WebElement StartTime1;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='FlowEndTimePicklist']")
	public WebElement EndTime1;
}
