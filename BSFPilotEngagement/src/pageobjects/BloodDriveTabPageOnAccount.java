package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="BloodDriveTabPageOnAccount"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDProfile"
     )             
public class BloodDriveTabPageOnAccount {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab__item']")
	public WebElement bloodDrives;
	@LinkType()
	@FindBy(xpath = "//th/descendant::a[contains(text(),', 7Eleven SB1')]")
	public WebElement futureOpp;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Templates (1)']")
	public WebElement templates2;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Future Opportunities (1)']")
	public WebElement futureOpportunities;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//flexipage-component2[2]//a[normalize-space(.)='View All']")
	public WebElement viewAll_futureOpp;	
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View All']")
	public WebElement viewAll_futureOpp1;
	@LinkType()
	@FindBy(xpath = "//table/tbody//a[@target='_self']")
	public WebElement ClickOppName;		
}
