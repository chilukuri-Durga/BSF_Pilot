package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadDetailPage"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class LeadDetailPage {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Convert']")
	public WebElement Convert;
	@FindBy(xpath = "//span[contains(text(),'upon conversion')]/parent::label")


	@BooleanType()
	public WebElement doNotCreateOpportunity;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert']")
	public WebElement Convert1;
			
}
