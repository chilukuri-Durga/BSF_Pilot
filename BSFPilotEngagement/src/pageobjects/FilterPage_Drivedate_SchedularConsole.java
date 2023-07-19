package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.provar.core.testapi.annotations.*;
import com.provar.plugins.forcedotcom.core.ui.UiAssert;

@Page(title = "FilterPage_Drivedate_SchedularConsole", summary = "", relativeUrl = "", connection = "ApsSchedular")
public class FilterPage_Drivedate_SchedularConsole {

	WebDriver driver;

	public FilterPage_Drivedate_SchedularConsole(WebDriver driver) {

		this.driver = driver;
	}

	@TextType()
	@FindBy(name = "sortBy")
	public WebElement orderBy;

	public void verifyselectOrderByDropDown() {

		String[] exp = { "Name", "Seniority Rank", "Weekly Hours", "Driving Roles - Travel Distance To",
				"Driving Roles - Travel Distance Back", "Staff Roles - Travel Distance To",
				"Staff Roles - Travel Distance Back" };
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='sortBy']"));
		Select select = new Select(dropdown);

		List<WebElement> options = select.getOptions();
		for (WebElement we : options) {
			boolean match = false;
			for (int i = 0; i < exp.length; i++) {
				if (we.getText().contains(exp[i])) {
					match = true;
				}
			}

		}

	}
	
	public void clicksortOrder(){
	    WebElement dropdown = driver.findElement(By.xpath("//select[@name='sortBy']"));
		Select soryBydrpdown = new Select(dropdown);
		soryBydrpdown.selectByVisibleText("Weekly Hours");
	
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//section[2]//div[2]/button")
	public WebElement closebtn_filterpopUp;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot/lightning-button-icon[1]/button")
	public WebElement filterByResourceName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Employment Type']")
	public WebElement employmentType;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label/span[normalize-space(.)='Show only On Call']")
	public WebElement showOnlyOnCall;

}
