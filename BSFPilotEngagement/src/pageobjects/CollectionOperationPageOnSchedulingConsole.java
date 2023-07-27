package pageobjects;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "CollectionOperationPageOnSchedulingConsole", summary = "", relativeUrl = "", connection = "ApsSchedular")
public class CollectionOperationPageOnSchedulingConsole {

	WebDriver driver;

	public CollectionOperationPageOnSchedulingConsole(WebDriver driver) {

		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Manage Territories']")
	public WebElement FilterCollectionOperationsIcon;

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
	@FindBy(xpath = "//span[contains(text(),'Valid from')]")
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

	@ButtonType()
	@FindBy(xpath = "//button[contains(text(),'Today')]")
	public WebElement selecttoday_week;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[1]//button[normalize-space(.)='Show actions']/lightning-primitive-icon")
	public WebElement showActions_DriveDateRecords;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='View details']")
	public WebElement viewDetails_ShowmoreDriveDate;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot/lightning-button-icon[2]/button/lightning-primitive-icon")
	public WebElement filterByResourceName;

	@ButtonType()
	@FindBy(xpath = "//button[text()='Clear' and @type='button']")
	public WebElement clear_District;

	@LinkType()
	@FindBy(xpath = "//a[text()='Drive Calendar']")
	public WebElement DriveCalendar;

	@TextType()
	@FindBy(xpath = "//input[@placeholder='Select a month']")
	public WebElement selectMonthInput;

	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Operation Record')]")
	public WebElement OperationRecordform_Submission;

	public void selectCurrentWeek_Today(String currentDate) {

		// 2023-07-21

		driver.findElement(By.xpath("//td[@data-date='" + currentDate + "']//span")).click();

	}

	public void selectdivision(String division) {

		// Central Atlantic'

		driver.findElement(By.xpath("//span[contains(text(),'" + division + "')]")).click();
	}

	public void ArcRegion(String ArcRegion) {

		// Ohio South

		driver.findElement(By.xpath("//span[contains(text(),'" + ArcRegion + "')]")).click();
	}

	public void Distrcit(String Distrcit) {

		// Columbus Franklin

		driver.findElement(By.xpath("//span[contains(text(),'" + Distrcit + "')]")).click();
	}

	public void selectdrivedate_DriveCalender_BeforeDriveStatus_Hold(String drivedate) throws Exception {

		/*
		 * String staffBeforeHold = driver.findElement(By.xpath("(//td[@data-value='" +
		 * drivedate +
		 * "']/descendant::div[@class='staff-info']//lightning-formatted-number)[4]")).
		 * getText().trim(); int staffNum = Integer.parseInt(staffBeforeHold);
		 */

		String staffBeforeHold = driver.findElement(By.xpath("(//td[@data-value='" + drivedate
				+ "']/descendant::div[@class='staff-info']//lightning-formatted-number)[2]")).getText().trim();
		int staffNum1 = Integer.parseInt(staffBeforeHold);

		if (staffNum1 == 0) {

			System.out.println("StaffNum Before DriveStatus Hold is:" + staffNum1);
		} else {
			throw new Exception("Staff is  increased");

		}

		/*
		 * String rbcBeforeHold = driver.findElement(By.xpath(
		 * "(//td[@data-value='2023-07-24']/descendant::span[text()='2RBC']/ancestor::div[1]/descendant::lightning-formatted-number[2]"
		 * )).getText().trim(); int rbcnum = Integer.parseInt(rbcBeforeHold);
		 */

		String rbcBeforeHold = driver.findElement(By.xpath("//td[@data-value='" + drivedate
				+ "']/descendant::span[text()='2RBC']/ancestor::div[1]/descendant::lightning-formatted-number[1]"))
				.getText().trim();
		int rbcnum1 = Integer.parseInt(rbcBeforeHold);

		if (rbcnum1 == 0) {

			System.out.println("2RBC Num Before Drive status Hold is:" + rbcnum1);
		} else {
			throw new Exception("2RBC is  increased");

		}

	}

	public void selectdrivedate_DriveCalender_AfterDriveStatus_Hold(String drivedate) throws Exception {

		/*
		 * String staffBeforeHold = driver.findElement(By.xpath("(//td[@data-value='" +
		 * drivedate +
		 * "']/descendant::div[@class='staff-info']//lightning-formatted-number)[4]")).
		 * getText().trim(); int staffNum = Integer.parseInt(staffBeforeHold);
		 */

		String staffAfterHold = driver.findElement(By.xpath("(//td[@data-value='" + drivedate
				+ "']/descendant::div[@class='staff-info']//lightning-formatted-number)[2]")).getText().trim();
		int staffNum1 = Integer.parseInt(staffAfterHold);

		if (staffNum1 > 0) {

			System.out.println("StaffNum After DriveStatus Hold is:" + staffNum1);
		} else {
			throw new Exception("Staff is  not increased");

		}

		/*
		 * String rbcBeforeHold = driver.findElement(By.xpath(
		 * "(//td[@data-value='2023-07-24']/descendant::span[text()='2RBC']/ancestor::div[1]/descendant::lightning-formatted-number[2]"
		 * )).getText().trim(); int rbcnum = Integer.parseInt(rbcBeforeHold);
		 */

		String rbcAfterHold = driver.findElement(By.xpath("//td[@data-value='" + drivedate
				+ "']/descendant::span[text()='2RBC']/ancestor::div[1]/descendant::lightning-formatted-number[1]"))
				.getText().trim();
		int rbcnum1 = Integer.parseInt(rbcAfterHold);

		if (rbcnum1 > 0) {

			System.out.println("2RBC Num After Drive status Hold is:" + rbcnum1);
		} else {
			throw new Exception("2RBC is not increased");

		}

	}

	public void selectMonth_DriveCalender() {

		Calendar cal = Calendar.getInstance();
		String month = new SimpleDateFormat("MMM").format(cal.getTime());

		String year = driver.findElement(By.xpath("//h2[@class='slds-align-middle']")).getText().trim();

		if (year.contains("2023")) {

			driver.findElement(By.xpath("//span[contains(text(),'" + month + "')]")).click();

		} else if (year.contains("2024")) {

			driver.findElement(By.xpath("//button[@title='Previous Year']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'" + month + "')]")).click();

		} else if (year.contains("2025")) {

			driver.findElement(By.xpath("//button[@title='Previous Year']")).click();
			driver.findElement(By.xpath("//button[@title='Previous Year']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'" + month + "')]")).click();
		}

	}

	public void clickOppNameOnResourceCalender(String OppName, String Location) {

		// Get the Drive Date
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat formDate = new SimpleDateFormat("dd");
		// String strDate = formDate.format(new Date());

		cal.add(Calendar.DATE, 4);
		String driveDate = formDate.format(cal.getTime());

		System.out.println(driveDate);

		// click DriveDateOppname
		WebElement DriveDataOPP = driver.findElement(By.xpath("//lightning-formatted-date-time[text()='" + driveDate
				+ "']/ancestor::td/descendant::div[contains(text(),'" + OppName + ", " + Location + "')]"));

		DriveDataOPP.click();

		// Click OpearationRec
		WebElement oppRecordBtn = driver.findElement(By.xpath("//button[contains(text(),'Operation Record')]"));
		oppRecordBtn.click();

	}

	public void clickRelatedTabOnOppRecordSubmission(String DriveDate, String StartTime, String EndTime)
			throws InterruptedException {

		// relatedtabclick
		WebElement relatedtab = driver.findElement(By.xpath("//a[contains(text(),'Related')]"));
		relatedtab.click();
		Thread.sleep(5000);

		// OperationUserin List

		List<WebElement> editlist = driver.findElements(
				By.xpath("//div[@class='operation-staff-list']/descendant::button[contains(text(),'Edit')]"));

		for (WebElement editbtn : editlist) {

			editbtn.click();
			Thread.sleep(4000);
			WebElement actualShiftStartDate = driver
					.findElement(By.xpath("//input[@name='actualShiftStart' and @class='slds-input']"));
			WebElement actualShiftStartTime = driver.findElement(
					By.xpath("//input[@name='actualShiftStart' and @class='slds-combobox__input slds-input']"));
			WebElement actualShiftEndDate = driver
					.findElement(By.xpath("//input[@name='actualShiftEnd' and @class='slds-input']"));
			WebElement actualShiftEndTime = driver.findElement(
					By.xpath("//input[@name='actualShiftEnd' and @class='slds-combobox__input slds-input']"));

			actualShiftStartDate.sendKeys(DriveDate);
			actualShiftStartTime.sendKeys(StartTime);
			actualShiftEndDate.sendKeys(DriveDate);
			actualShiftEndTime.sendKeys(EndTime);

			WebElement EarlyDepartureorLateArrivaldropdown = driver.findElement(
					By.xpath("//label[contains(text(),'Early Departure')]/ancestor::div[1]/descendant::button"));

			EarlyDepartureorLateArrivaldropdown.click();
			WebElement selectEarlyDepartureorLateArrivaldropdown = driver
					.findElement(By.xpath("//span[contains(text(),'Turnaround Time')]"));
			selectEarlyDepartureorLateArrivaldropdown.click();

			WebElement savebtn = driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]"));
			savebtn.click();
			Thread.sleep(5000);

		}

	}

	public void clickOperationTabOnOppRecordSubmission(String DriveDate, String DriveDate1, String StartTime,
			String EndTime,String User) throws InterruptedException {

		// OperationTab
		WebElement operationtab = driver.findElement(By.xpath("//a[contains(text(),'Operation')]"));
		operationtab.click();
		Thread.sleep(5000);

		// Drive Information Section

		WebElement driveInfoSection = driver.findElement(By.xpath("//span[contains(text(),'Drive Information')]"));
		driveInfoSection.click();

		WebElement actualDriveStartDate = driver
				.findElement(By.xpath("//input[@name='actualDriveStart' and @class='slds-input']"));
		WebElement actualDriveStartTime = driver.findElement(
				By.xpath("//input[@name='actualDriveStart' and @class='slds-combobox__input slds-input']"));
		WebElement actualDriveEndDate = driver
				.findElement(By.xpath("//input[@name='actualDriveEnd' and @class='slds-input']"));
		WebElement actualDriveEndTime = driver
				.findElement(By.xpath("//input[@name='actualDriveEnd' and @class='slds-combobox__input slds-input']"));

		WebElement saveBtn_OperationTab = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));

        WebElement donorAmbassadorsActual = driver.findElement(By.xpath("//input[@name='donorAmbassadorsActual']"));
        donorAmbassadorsActual.sendKeys(User);
        
		// To check Validation on Drive Info sec
		actualDriveStartDate.sendKeys(DriveDate);
		actualDriveStartTime.sendKeys(StartTime);
		actualDriveEndDate.sendKeys(DriveDate1); // One DayPrior to DriveDate
		actualDriveEndTime.sendKeys(EndTime);

		saveBtn_OperationTab.click();
		// Errro Validation1
		WebElement error_driveInfo1 = driver.findElement(By.xpath("//ul[@class='errorsList']//li"));

		String error1 = error_driveInfo1.getText().trim();
		if (error1.contains("Actual Drive End should be greater than Actual Drive Start")) {

			System.out.println("Error is displayed with:" + error1);

		} else {
			System.out.println("Error is not displayed with:" + error1);
		}

		actualDriveEndDate.sendKeys(DriveDate); // Enter correct Drive Date
		WebElement powerRedMachinesUsed = driver.findElement(By.xpath("//input[@name='powerRedMachinesUsed']"));
		powerRedMachinesUsed.sendKeys("10");

		saveBtn_OperationTab.click();

		// Error Validation2
		WebElement error_driveInfo2 = driver.findElement(By.xpath("//ul[@class='errorsList']//li"));

		String error2 = error_driveInfo2.getText().trim();
		if (error1.contains("machines used should always be equal to or less than the")) {

			System.out.println("Error is displayed with:" + error2);

		} else {
			System.out.println("Error is not displayed with:" + error2);
		}
		
		powerRedMachinesUsed.sendKeys("1");
		Thread.sleep(5000);
		
		//Late End Drive Section
		
		WebElement LateEndDriveSection=driver.findElement(By.xpath("//span[contains(text(),'Late End Drive')]/ancestor::button"));		
        LateEndDriveSection.click();
        Thread.sleep(5000);
        
        WebElement LateEndDrivetoggle=driver.findElement(By.xpath("//input[@name='lateEndDrive']/ancestor::label"));
        LateEndDrivetoggle.click();
        Thread.sleep(5000);
        
        WebElement  lateEndDriveApprovedBy=driver.findElement(By.xpath("//input[@name='lateEndDriveApprovedBy']"));
       
        lateEndDriveApprovedBy.sendKeys(User);  //send charge user
        
        WebElement  LateEndReason=driver.findElement(By.xpath("//label[contains(text(),'Late End Reason')]/ancestor::div[1]/descendant::button"));
        LateEndReason.click();
        Thread.sleep(2000);
        WebElement  selectLateEndReason=driver.findElement(By.xpath("//span[contains(text(),'Prolonged donor processing time')]"));
        selectLateEndReason.click();
        
        
        WebElement  submit_OperationRecord=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit_OperationRecord.click();
        Thread.sleep(5000);
        
        
        
 
       

	}

}
