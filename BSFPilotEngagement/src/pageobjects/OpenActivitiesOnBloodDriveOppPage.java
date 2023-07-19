package pageobjects;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "OpenActivitiesOnBloodDriveOppPage", summary = "", relativeUrl = "", connection = "DRDProfile")
public class OpenActivitiesOnBloodDriveOppPage {

	WebDriver driver;

	public OpenActivitiesOnBloodDriveOppPage(WebDriver driver) {

		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//a[contains(text(),'72 Hour Check in')]")
	public WebElement _2HoursCheckIn;

	@TextType()
	@FindBy(xpath = "//a[contains(text(),'72 Hour Check in')]")
	public WebElement _2HoursCheckIn1;

	@TextType()
	@FindBy(xpath = "//span[text()='Subject']/ancestor::div[2]/descendant::span[@class='uiOutputText']")
	public WebElement subject;

	@TextType()
	@FindBy(xpath = "//span[text()='Due Date']/ancestor::div[2]/descendant::span[@class='uiOutputDate']")
	public WebElement DueDate;

	@ButtonType()
	@FindBy(xpath = "//span[text()='Notifications']/ancestor::button")
	public WebElement NotificationIcon;

	@TextType()
	@FindBy(xpath = "(//li[@class='notification-row notification-read unsNotificationsListRow'])[1]//a//span[@class='notification-text uiOutputText']")
	public WebElement notificationmsg;

	public void clicknotificationMsg() {

		driver.findElement(By.xpath(
				"(//li[@class='notification-row notification-read unsNotificationsListRow'])[1]//a//span[@class='notification-text uiOutputText']"))
				.click();

	}

	public void verifyDueDate1() throws ParseException {

		// Dayofweek
		WebElement dayofweek = driver.findElement(
				By.xpath("//span[text()='Day of Week']/ancestor::div[2]/descendant::lightning-formatted-text"));
		String dayofweek1 = dayofweek.getText().trim();

		// Drive Date
		WebElement DriveDate = driver.findElement(
				By.xpath("//span[text()='Drive Date']/ancestor::div[2]/descendant::lightning-formatted-text"));
		String driveDate1 = DriveDate.getText().trim();
		Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(driveDate1);

		// Due Date
		WebElement DueDate = driver
				.findElement(By.xpath("(//div[text()='Due Date:']/parent::div[1]/descendant::span)[2]"));
		String dueDate1 = DueDate.getText().trim();
		Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse(dueDate1);

		if (dayofweek1.contains("Monday") || dayofweek1.contains("Tuesday") || dayofweek1.contains("Wednesday")) {

			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date1);
			int daysToSubtract = 5;
			calendar.add(Calendar.DAY_OF_MONTH, -daysToSubtract);
			Date newDate = calendar.getTime();
			System.out.println("Original Date: " + date1);
			System.out.println("New Date: " + newDate);

			newDate.equals(date2);

		} else {
		
		    Calendar calendar = Calendar.getInstance();
			calendar.setTime(date1);
			int daysToSubtract = 3;
			calendar.add(Calendar.DAY_OF_MONTH, -daysToSubtract);
			Date newDate = calendar.getTime();
			System.out.println("Original Date: " + date1);
			System.out.println("New Date: " + newDate);
			
			newDate.equals(date2);

		}

	}

	public void verifyDueDate() throws ParseException {

		// Drive Date
		WebElement DriveDate = driver.findElement(
				By.xpath("//span[text()='Drive Date']/ancestor::div[2]/descendant::lightning-formatted-text"));
		String driveDate1 = DriveDate.getText().trim();

		String sDate1 = driveDate1;
		Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);

		Calendar c = Calendar.getInstance();
		c.setTime(date1);
		// String dayOfWeek = c.get(Calendar.);

		Format f = new SimpleDateFormat("EEEE");
		String str = f.format(date1);

		// Due Date
		WebElement DueDate = driver
				.findElement(By.xpath("(//div[text()='Due Date:']/parent::div[1]/descendant::span)[2]"));
		String dueDate1 = DueDate.getText().trim();

		String sDate2 = dueDate1;
		Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse(sDate2);

		Calendar c1 = Calendar.getInstance();
		c.setTime(date2);
		// String dayOfWeek = c.get(Calendar.);

		Format f1 = new SimpleDateFormat("EEEE");
		String str1 = f.format(date2).trim();

		if (str.contains("Saturday") || str.contains("Sunday")) {

			// String duedate=date2.toString();

			LocalDate date = LocalDate.parse(sDate1);
			LocalDate newDate = date.minusDays(5);

			newDate.equals(date2);

		} else {
			LocalDate date = LocalDate.parse(sDate1);
			LocalDate newDate = date.minusDays(3);

			newDate.equals(date2);

		}

	}

	@TextType()
	@FindBy(xpath = "//th[@data-label='Account']/descendant::a//span")
	public WebElement AccountNameOnServiceRole;

	public void clickAccountNameOnServiceRole_Contact() {

		driver.findElement(By.xpath("//th[@data-label='Account']/descendant::a//span"));

	}

	@TextType()
	@FindBy(xpath = "//span[@id='window']/ancestor::a")
	public WebElement clickAccountNameOnServiceRole;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View AllAccount Service Roles']")
	public WebElement viewAllAccountServiceRoles;

	@TextType()
	@FindBy(xpath = "//table/tbody//a[contains(@class,'flex-wrap')]")
	public WebElement AccountNameOnServiceRole1;

	@TextType()
	@FindByLabel(label = "Day of Week", labelType = LabelType.SalesforceLightningDesignSystem)
	public WebElement Day_of_Week__c;

}
