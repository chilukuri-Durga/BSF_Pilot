package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "BllodDriveOppotyunityPage", summary = "", relativeUrl = "", connection = "DRDprofile")
public class BllodDriveOppotyunityPage {

	WebDriver driver;

	public BllodDriveOppotyunityPage(WebDriver driver) {

		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Opportunity.sked_Generate_Drive']")
	public WebElement generateDriveButtonClick;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='Drive was generated successfully.']")
	public WebElement DriverGenerateSuccessfullMessage;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close']")
	public WebElement closeButtonClick;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='main']//button[normalize-space(.)='MoreTabs']")
	public WebElement moreTabsClick;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Drive Scheduling']")
	public WebElement driveScheduling;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Draft']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c_draft;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Discovery']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Dicovery;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Mark Stage as Complete']")
	public WebElement PathAssistantStep_MarkStageNameAsComplete;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Solicitation']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Solicitation;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Committed']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Committed;

	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//select")
	public WebElement stagePopup;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement saveClickOnStagePopup;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Tentative']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Closed']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement StageName_Closed;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Change Closed Stage']")
	public WebElement PathAssistantStep_ChangeClosedStageName;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Tentative']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c_Tentative;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Confirmed']/slot[@name='outputField']/lightning-formatted-text")
	public WebElement Drive_Status__c_Confirmed;

	@TextType()
	@FindBy(xpath = "//div[contains(text(),'Do you want to continue?')]")
	public WebElement Doyouwanttocontinue;

	/*
	 * @LinkType()
	 * 
	 * @FindBy(xpath = "//span[text()='View All']") public WebElement
	 * ViewAll_driveonCalender_DriveSchedulingTab;
	 */

	@LinkType()
	@FindBy(xpath = "//table//tbody//th//a")
	public WebElement DriveNameOnDoc;
	
	public void clickDriveOnCalenderRecordOnOpp(String OppName,String Location){
	
	WebElement docrecordonOpp=driver.findElement(By.xpath("//span[@id='window' and contains(text(),'"+OppName+", "+Location+"')]/ancestor::a"));
	
	Actions action = new Actions(driver);

	action.moveToElement(docrecordonOpp).click().perform();
	/*
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("arguments[0].click();", docrecordonOpp);
	 */
	
	
	}

	public void clickYesOnLowProductivityOnDriveGenerate() throws InterruptedException {

		WebElement lowProdDrive = driver.findElement(By.xpath("//div[contains(text(),'Do you want to continue?')]"));
		WebElement YesbtnOnlowProdDrive = driver.findElement(By.xpath(
				"//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Yes']"));
		WebElement closebtnOnlowProdDrive = driver.findElement(By.xpath(
				"//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close']"));
		// String lowProd = lowProdDrive.getText().trim();

		WebElement drivegen = driver.findElement(By.xpath("//h2[contains(text(),'Drive Generator')]"));

		try {

			if (drivegen.isDisplayed()) {

				Actions action = new Actions(driver);

				action.moveToElement(YesbtnOnlowProdDrive).click().perform();

				Thread.sleep(7000);

				action.moveToElement(closebtnOnlowProdDrive).click().perform();
			}
			// closebtnOnlowProdDrive.click();

		} catch (Exception e) {
			Actions action = new Actions(driver);
			action.moveToElement(closebtnOnlowProdDrive).click().perform();
		}

	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Yes']")
	public WebElement yes_LowProductivity;

}
