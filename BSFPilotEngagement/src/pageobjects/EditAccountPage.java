package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="EditAccountPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDProfile"
     )             
public class EditAccountPage {

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
			
}
