package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CollectionOperationPageOnSchedulingConsole"                                
     , summary=""
     , relativeUrl=""
     , connection="ApsSchedular"
     )             
public class CollectionOperationPageOnSchedulingConsole {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Division']/following-sibling::c-slwc-click-outside//input")
	public WebElement division;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Central Atlantic']")
	public WebElement SelectDivision;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Done']")
	public WebElement done_Divison;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='ARC Region']/following-sibling::c-slwc-click-outside//input")
	public WebElement ARCRegion;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Ohio North']")
	public WebElement selectArcRegion;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Done']")
	public WebElement done_ArcRegion;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='District']/following-sibling::c-slwc-click-outside//input")
	public WebElement district;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Toledo']")
	public WebElement selectDistrict;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Done']")
	public WebElement done_District;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//section//div[2]/button[2]")
	public WebElement Done_CollectionOperationFilterPopUp;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Toledo OH']")
	public WebElement SelectCreatedOption_CollectedOperationSearcBox;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Done']")
	public WebElement done_CollectionOperationSearchBox;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//c-slwc-week-date-picker//div/input")
	public WebElement date;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]")
	public WebElement dateselect;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-button/button[normalize-space(.)='Select All']")
	public WebElement selectAll_District;
	
	
	
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Clear']")
	public WebElement clear_CollectionOperationSeachbox;
	
	@ButtonType()
	@FindBy(xpath = "//button[@title='Next Month']")
	public WebElement NextMonth;
	
	@ButtonType()
	@FindBy(xpath = "//tbody/tr[@class='week-2']/td[1]//span")
	public WebElement FirstWeekOfNextMonth;
	
	
    @ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Today')]")
	public WebElement selecttoday;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[1]//button[normalize-space(.)='Show actions']/lightning-primitive-icon")
	public WebElement showActions_DriveDateRecords;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='View details']")
	public WebElement viewDetails_ShowmoreDriveDate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot/lightning-button-icon[2]/button/lightning-primitive-icon")
	public WebElement filterByResourceName;
	
	
	
	
	
			
}
