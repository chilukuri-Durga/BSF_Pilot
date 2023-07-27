package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AppLauncherPage"                                
     , summary=""
     , relativeUrl=""
     , connection="ApsSchedular"
     )             
public class AppLauncherPage {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='View All']")
	public WebElement viewAll;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Scheduling Console']")
	public WebElement schedulingConsole;
	
	@LinkType()
	@FindBy(xpath = "//*[contains(text(),'Resource Calendar')]/ancestor::a")
	public WebElement ResourceCalender;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Manage Territories']")
	public WebElement FilterCollectionOperationsIcon;
			
}
