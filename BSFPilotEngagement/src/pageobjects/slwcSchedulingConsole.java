package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Slwc Scheduling Console"                                
               , summary=""
               , connection="ApsSchedular"
               , auraComponent="slwcSchedulingConsole"
               , namespacePrefix=""
     )             
public class slwcSchedulingConsole {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Division']/following-sibling::c-slwc-click-outside//input")
	public WebElement division;
	@ChoiceListType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//select[@name='sortBy']")
	public WebElement orderBy;
	
}
