package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "LeadRecordTypePage", summary = "", relativeUrl = "", connection = "admin")
public class LeadRecordTypePage {

	WebDriver driver;

	public LeadRecordTypePage(WebDriver driver) {
		this.driver = driver;
	}

	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement Next;
	
	
	
	
	

}
