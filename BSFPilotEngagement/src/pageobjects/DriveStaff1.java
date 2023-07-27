package pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveStaff1"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class DriveStaff1 {

	@TestLogger

	public Logger testLogger;


WebDriver driver;

	public DriveStaff1(WebDriver driver) {

		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "2']")
	public WebElement user1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('one-record-home-flexipage2').shadowRoot.querySelector('forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-drive_-record_-page___sked_-drive__c___-v-i-e-w').shadowRoot.querySelector('forcegenerated-flexipage_drive_record_page_sked_drive__c__view_js').shadowRoot.querySelector('c-slwc-drive-management').shadowRoot.querySelector('c-slwc-drive-staffing-details').shadowRoot.querySelectorAll('div')[18]")
	public WebElement charge1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li[1]//li/div")
	public WebElement chargeCheck;
	
	
	public void dragAndDrop() throws InterruptedException, AWTException{
	
	WebElement fromElement1 = driver .findElement(By.xpath("//a[contains(text(),'Anyjiah Whitfield 537328')]/ancestor::div[5]"));
	 WebElement toElement1 =driver.findElement(By.xpath("//a[contains(text(),'Charge')]/ancestor::div[5]/ancestor::li[1]"));
	
	
	     Actions builder = new Actions(driver); 
	     int xOffset1 = fromElement1.getLocation().getX();
		
		 int yOffset1 =  fromElement1.getLocation().getY();
		
		
		//Secondly, get x and y offset for to object
		int xOffset = toElement1.getSize().getWidth();
				
		int yOffset =  toElement1.getSize().getHeight();
	
	
	  //  xOffset =(xOffset-xOffset1)+10;
		//yOffset=(yOffset-yOffset1)+20;
		
		builder.dragAndDropBy(fromElement1, xOffset,yOffset).perform();
	
	
	
	
	
	
	
	






	
	
	
      // Actions builder = new Actions(driver); 
	//builder.dragAndDrop(fromElement1,toElement1).perform();
	
	//JavascriptExecutor _js = (JavascriptExecutor)driver;

//_js.executeScript("$(arguments[0]).simulate('drag-n-drop',{dragTarget:arguments[1],interpolation:{stepWidth:100,stepDelay:50}});", fromElement1, toElement1);
		 
	
	//Action dragAndDrop1 =builder.clickAndHold(fromElement1).moveToElement(toElement1).release(toElement1).build();
	//Thread.sleep(3000);
	//dragAndDrop1.perform();
	
	
	//new Actions(driver).dragAndDrop(fromElement1, toElement1).release().build().perform();

   // Robot robot = new Robot();

   // robot.keyPress(KeyEvent.VK_ESCAPE);

   // robot.keyRelease(KeyEvent.VK_ESCAPE);
	
		// testLogger.info("");
		
	}
	
			
}
