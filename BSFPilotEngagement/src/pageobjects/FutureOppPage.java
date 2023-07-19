package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "FutureOppPage", summary = "", relativeUrl = "", connection = "DRDProfile")
public class FutureOppPage {

	WebDriver driver;

	public FutureOppPage(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//table/tbody/descendant::th[1]/descendant::a")
	public WebElement futureOpp;

	@TextType()
	@FindByLabel(label = "Drive Name", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement Name;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Discovery']/slot[@name='outputField']/lightning-formatted-text[normalize-space(.)='Discovery']")
	public WebElement StageName;

	public void clickOppName(String location) throws InterruptedException {
		//WebElement oppname = driver.findElement(By.xpath("(//table/tbody/descendant::th[1]/descendant::a)[1]"));

		WebElement stagename = driver.findElement(By.xpath(
				"//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Discovery']/slot[@name='outputField']/lightning-formatted-text[normalize-space(.)='Discovery']"));
		clickOppName1(location);
		Thread.sleep(6000);
		String stage = stagename.getText().toLowerCase().trim();
		if (stage.contains("discovery")) {
			System.out.println("stage is verified with" + stage);
		} else {
          System.out.println("stage is not verified with" + stage);
		}
		}
		
		public void clickOppName1(String location){
		
	
	    driver.findElement(By.xpath("//a[contains(text(),'"+location+"')]")).click();

	}
}
