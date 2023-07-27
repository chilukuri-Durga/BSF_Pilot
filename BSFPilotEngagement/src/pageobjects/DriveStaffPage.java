package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveStaffPage"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class DriveStaffPage {

	@LinkType()
	@FindBy(xpath = "//a[contains(text(),'Anyjiah Whitfield 537328')]/ancestor::div[2]")
	public WebElement user1_Resource;
	@TextType()
	@FindBy(xpath = "//a[contains(text(),'Charge')]/ancestor::div[3]")
	public WebElement ChargePosition_User1;
	@TextType()
	@FindBy(xpath = "(//input[@placeholder='Filter by Name'])[2]")
	public WebElement filterByResourceName;
	@TextType()
	@FindBy(xpath = "//a[text()='Anyjiah Whitfield 537328']")
	public WebElement user1_Drag;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Charge']")
	public WebElement chargePosition;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//c-slwc-drive-staffing-details/div/div/div/div/div//li")
	public WebElement User1Resurce;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/div[1]/div[2]/div/ul/li[1]/div")
	public WebElement charge1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p[normalize-space(.)='Driver, Inside, Mobile']")
	public WebElement driverDrop1;
			
}
