package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadConversionPage_AccCont"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class LeadConversionPage_AccCont {

	@LinkType()
	@FindBy(xpath = "//div[text()='Account']/ancestor::div[1]/descendant::a[1]")
	public WebElement ConvertedAccountName;
			
}
