package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AddRelatedSite"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDProfile"
     )             
public class AddRelatedSite {

	@ButtonType()
	@FindBy(xpath = "//span[text()='Related Sites']/ancestor::div[4]/descendant::button")
	public WebElement showMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@name='New']")
	public WebElement new_;
	@TextType()
	@FindByLabel(label = "Location")
	public WebElement sked_Location__c;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement save;
			
}
