package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "EditAccountPage", summary = "", relativeUrl = "", connection = "DRDProfile")
public class EditAccountPage {

	WebDriver driver;

	public EditAccountPage(WebDriver driver) {

		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//button[@title='Edit Accepts Automation']")
	public WebElement EditAcceptAutomation;

	@TextType()
	@FindByLabel(label = "Accepts Automation")
	public WebElement Accepts_Automation2__c;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='SaveEdit']")
	public WebElement SaveEdit;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Yes']")
	public WebElement Accepts_Automation2__c1;

	public void selectAcceptAutomation(String AcceptAutomation) {
		driver.findElement(By.xpath(
				"//label[contains(text(),'Accepts Automation')]/parent::lightning-combobox/descendant::button[@role='combobox']"))
				.click();

		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();

		/*
		 * List<WebElement> allOptions1 = driver.findElements(By.xpath(
		 * "//lightning-base-combobox-item//span[@class='slds-truncate']"));
		 * 
		 * for (int i = 0; i < allOptions1.size(); i++) {
		 * 
		 * if (allOptions1.get(i).getAttribute("title").contains(AcceptAutomation)) {
		 * allOptions1.get(i).click(); System.out.println("clicked"); } }
		 */
	}

	@TextType()
	@FindByLabel(label = "Accepts Automation")
	public WebElement Accepts_Automation2__c2;

	@TextType()
	@FindByLabel(label = "Accepts Automation")
	public WebElement Accepts_Automation2__c3;

}
