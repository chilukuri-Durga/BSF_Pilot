package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page(title = "BloodDriveTabPageOnAccount", summary = "", relativeUrl = "", connection = "DRDProfile")
public class BloodDriveTabPageOnAccount {

	WebDriver driver;

	public BloodDriveTabPageOnAccount(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab__item']")
	public WebElement bloodDrives;

	@LinkType()
	@FindBy(xpath = "//a[text()='Drive Scheduling']")
	public WebElement driveScheduling;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Hold Drive')]")
	public WebElement holdDriveBtn;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement SubmitDrive;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Drive Staffing')]")
	public WebElement driveStaffingBtn;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Remove Hold')]")
	public WebElement RemoveholdDriveBtn;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Are you sure you want to hold this Drive?')]")
	public WebElement AreyousureyouwanttoholdthisDrive;

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Are you sure you want to remove hold this Drive?')]")
	public WebElement AreyousureyouwanttoremoveholdthisDrive;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	public WebElement yes_AreyousureyouwanttoholdthisDrive;

	@TextType()
	@FindBy(xpath = "//p[contains(text(),'Drive Status')]/parent::div/descendant::lightning-formatted-text")
	public WebElement VerifyHoldStatus;

	@LinkType()
	@FindBy(xpath = "//th/descendant::a[contains(text(),', 7Eleven SB1')]")
	public WebElement futureOpp;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Templates (1)']")
	public WebElement templates2;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Future Opportunities (1)']")
	public WebElement futureOpportunities;

	@LinkType()
	@FindBy(xpath = "(//*[contains(text(),'View All')])[2]")
	public WebElement viewAll_futureOpp;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View All']")
	public WebElement viewAll_futureOpp1;

	@LinkType()
	@FindBy(xpath = "//table/tbody//a[@target='_self']")
	public WebElement ClickOppName;

	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Are you sure you want to save and dispatch?')]")
	public WebElement Areyousureyouwanttosaveanddispatch;

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	public WebElement yes_Areyousureyouwanttosaveanddispatch;
	
	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Save & Dispatch')]")
	public WebElement SaveDispatchbtn;
	
	
	
	
	
	public void clickOppNameOnAcc(String Company){
	
	WebElement OppName=driver.findElement(By.xpath("//a[contains(text(),'"+Company+", TBD')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", OppName);
	}


	public void clickOppName() {

		WebElement ClickOppName1 = driver.findElement(By.xpath("(//table/tbody//a[@target='_self'])[1]"));
		ClickOppName1.click();

	}

	public void clickOppNameOnBloodDriveTab(String OppName, String Location) {

		WebElement OppNameOnAccount = driver.findElement(By.xpath("//a[contains(@title,'" + OppName + ", " + Location
				+ "') or contains(text(),'" + OppName + ", " + Location + "')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", OppNameOnAccount);

		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(OppNameOnAccount).click().perform();
		 */
	}

	public void addUserstodriveStaff(String User1, String User2, String User3) throws InterruptedException {
		// Sending user1 to charge position
		WebElement filterByName = driver.findElement(By.xpath("//input[@placeholder='Filter by Name']"));

		// String User1="Anyjiah Whitfield 537328";

		filterByName.sendKeys(User1);
		//Thread.sleep(10000);
		
		
		
		
		

		/*
		 * // WebElement //
		 * user1isfound=driver.findElement(By.xpath("//a[contains(text(),'"+User1+"')]")
		 * ); WebDriverWait wait = new WebDriverWait(driver,30);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//a[contains(text(),'" + User1 + "')]/ancestor::div[2]"))); WebElement
		 * fromElement1 = driver .findElement(By.xpath("//a[contains(text(),'" + User1 +
		 * "')]/ancestor::div[2]"));
		 * 
		 * WebElement toElement1 =
		 * driver.findElement(By.xpath("//a[contains(text(),'Charge')]/ancestor::div[3]"
		 * ));
		 * 
		 * Actions builder = new Actions(driver); builder.dragAndDrop(fromElement1,
		 * toElement1).build().perform();
		 * 
		 * 
		 * //Action dragAndDrop1
		 * =builder.clickAndHold(fromElement1).moveToElement(toElement1).release(
		 * toElement1).build();
		 * 
		 * //dragAndDrop1.perform();
		 * 
		 * 
		 * // Sending user2 to driver position
		 * 
		 * // String User2="Anzour Khout 534354";
		 * 
		 * filterByName.clear(); filterByName.sendKeys(User2);
		 * 
		 * Thread.sleep(10000);
		 * 
		 * WebElement fromElement2 = driver
		 * .findElement(By.xpath("//a[contains(text(),'" + User2 +
		 * "')]/ancestor::div[2]"));
		 * 
		 * WebElement toElement2 =
		 * driver.findElement(By.xpath("//a[contains(text(),'Driver')]/ancestor::div[3]"
		 * ));
		 * 
		 * builder.dragAndDrop(fromElement2, toElement2).perform();
		 * 
		 * //Action dragAndDrop2 =
		 * builder.clickAndHold(fromElement2).moveToElement(toElement2).release(
		 * toElement2).build();
		 * 
		 * //dragAndDrop2.perform();
		 * 
		 * // Sending user3 to 2RBC position
		 * 
		 * // String User3="Cynthia Stallworth 507946";
		 * 
		 * filterByName.clear(); filterByName.sendKeys(User3);
		 * 
		 * Thread.sleep(10000);
		 * 
		 * WebElement fromElement3 = driver
		 * .findElement(By.xpath("//a[contains(text(),'" + User3 +
		 * "')]/ancestor::div[2]"));
		 * 
		 * WebElement toElement3 =
		 * driver.findElement(By.xpath("//a[contains(text(),'2RBC')]/ancestor::div[3]"))
		 * ;
		 * 
		 * builder.dragAndDrop(fromElement3, toElement3).perform();
		 * 
		 * //Action dragAndDrop3 =
		 * builder.clickAndHold(fromElement3).moveToElement(toElement3).release(
		 * toElement3).build();
		 * 
		 * //dragAndDrop3.perform();
		 * 
		 * Thread.sleep(10000);
		 */
		/*
		 * WebElement saveAndDispatch =
		 * driver.findElement(By.xpath("//button[contains(text(),'Save & Dispatch')]"));
		 * 
		 * saveAndDispatch.click();
		 */

	}

}
