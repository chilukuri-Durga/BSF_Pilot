package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveOnCalenderPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDprofile"
     )             
public class DriveOnCalenderPage {


	@LinkType()
	@FindBy(xpath = "//table//tbody//th//a']")
	public WebElement DriveNameOnDoc;
	
	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitBtn;
	
	
	
		
		
			
}
