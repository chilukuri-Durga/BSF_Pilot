package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "AccountTeamTabPageOnAccount", summary = "", relativeUrl = "", connection = "Drdmanager")
public class AccountTeamTabPageOnAccount {

	WebDriver driver;

	public AccountTeamTabPageOnAccount(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Account Team']")
	public WebElement accountTeam;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Add Team Members']")
	public WebElement AccountTeamMember;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit User: Item 1']")
	public WebElement user;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit Team Role: Item 1 Edited']")
	public WebElement teamRole;

	public void clickAccTeam() throws InterruptedException {
		WebElement accountTeamtab = driver.findElement(By.xpath("//a[text()='Account Team']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(accountTeamtab);
		actions.perform();
		accountTeamtab.click();
		Thread.sleep(5000);

	}

	public void AddAccTeam() throws InterruptedException {
		WebElement addTeamMemBtn = driver.findElement(By.xpath("//div[@title='Add Team Members']"));
		addTeamMemBtn.click();
		Thread.sleep(2000);

	}

	public void addCoveringRecruManagement(String startDateAccTeam, String endDateAccTeam) throws InterruptedException {

		/*
		 * WebElement user1 = driver.findElement(By.
		 * xpath("//span[text()='Edit User: Item 1']/ancestor::button[1]"));
		 * 
		 * WebElement role = driver.findElement(By.
		 * xpath("//span[text()='Edit Team Role: Item 1']/ancestor::button[1]"));
		 * 
		 * WebElement startDate = driver .findElement(By.
		 * xpath("//span[text()='Edit Start Date: Item 1']/ancestor::button[1]"));
		 * 
		 * WebElement endDate = driver.findElement(By.
		 * xpath("//span[text()='Edit End Date: Item 1']/ancestor::button[1]"));
		 */
		WebElement coverageReason = driver
				.findElement(By.xpath("//span[text()='Edit Coverage Reason: Item 1 Edited']/ancestor::button[1]"));

		/*
		 * // Select User user1.click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//input[@title='Search People']")).
		 * sendKeys("micha alt"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[@title='Micha Alt DRD']")).isDisplayed();
		 * driver.findElement(By.xpath("//div[@title='Micha Alt DRD']")).click();
		 * 
		 * // Select Role
		 * 
		 * role.click(); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[contains(text(),'--None--')]")).click();
		 * List<WebElement> allOptions = driver
		 * .findElements(By.xpath("//div[@class='select-options']/descendant::ul//li//a"
		 * ));
		 * 
		 * for (int i = 0; i < allOptions.size(); i++) {
		 * 
		 * if (allOptions.get(i).getText().contains("Account Manager")) {
		 * allOptions.get(i).click(); System.out.println("clicked"); } }
		 * 
		 * // Start Date startDate.click();
		 * driver.findElement(By.xpath("//input[@class='slds-grow input']")).sendKeys(
		 * startDateAccTeam);
		 * 
		 * // EndDate endDate.click();
		 * driver.findElement(By.xpath("//input[@class='slds-grow input']")).sendKeys(
		 * endDateAccTeam);
		 */

		// Coverage Reason
		coverageReason.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'--None--')]")).click();
		List<WebElement> allOptions1 = driver
				.findElements(By.xpath("//div[@class='select-options']/descendant::ul//li//a"));

		for (int i = 0; i < allOptions1.size(); i++) {

			if (allOptions1.get(i).getText().contains("Leave of Absence")) {
				allOptions1.get(i).click();
				System.out.println("clicked");
			}
		}
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(4000);
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//tbody//input")
	public WebElement userInput;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Account Manager']")
	public WebElement teamRoleinput;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit Start Date: Item 1']")
	public WebElement editStartDateItem1;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Sort by:Start DateSorted: NoneShow actions']/a[normalize-space(.)='Sort by:Start Date']/span[normalize-space(.)='Start Date']")
	public WebElement StartDateInput;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//td//input")
	public WebElement StartDateInput1;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit End Date: Item 1']")
	public WebElement editEndDateItem1;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='End Date*']/following-sibling::div//input")
	public WebElement EndDateInput1;

	public void startDate(String startDateAccTeam) {

		driver.findElement(By.xpath("//input[@class='slds-grow input']")).sendKeys(startDateAccTeam);

	}
	
	public void endDate(String endDateAccTeam) {

		driver.findElement(By.xpath("//input[@class='slds-grow input']")).sendKeys(endDateAccTeam);

	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement saveButton;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit Team Role: Item 1']")
	public WebElement teamRole1;

	@LinkType()
	@FindBy(xpath = "//div/a[normalize-space(.)='--None--']")
	public WebElement teamRoleinpput1;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Account Manager']")
	public WebElement accountManager;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Edit Coverage Reason: Item 1']")
	public WebElement editCoverageReasonItem1;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='--None--']")
	public WebElement coveragereadonInput;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leave of Absence (LOA)']")
	public WebElement leaveOfAbsenceLOA;
}
