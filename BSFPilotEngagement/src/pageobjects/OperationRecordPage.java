package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OperationRecordPage"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class OperationRecordPage {

	 public Logger testLogger;
	WebDriver driver;

	public OperationRecordPage(WebDriver driver) {

		this.driver = driver;
	}
	
	
	
	@TextType()
	@FindBy(xpath = "//*[text()='Status' and @class='test-id__field-label']/ancestor::div[2]/descendant::lightning-formatted-text")
	public WebElement operationstatus;
	
	
	
	public void getOperationRecordName(){
	
	WebElement operationName=driver.findElement(By.xpath("//*[text()='Operation Record Name' and @class='test-id__field-label']/ancestor::div[2]/descendant::lightning-formatted-text"));
    
	/*
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("arguments[0].scrollIntoView(true);", operationName);
	 */
    
    String opsName=operationName.getText().trim();
    testLogger.info("OperationRecordNumber is:" + opsName);
    

	}
	
	
	
	
	//*[text()='Operation Record Name' and @class='test-id__field-label']/ancestor::div[2]/descendant::lightning-formatted-text
			
}
