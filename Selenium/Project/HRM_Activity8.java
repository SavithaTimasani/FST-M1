package HRMProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HRM_Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		userName.sendKeys("orange");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submit1.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Apply Leave")).click();
		WebElement dropdown = driver.findElement(By.id("applyleave_txtLeaveType"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("DayOff");
		driver.findElement(By.id("applyleave_txtFromDate")).clear();
		driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2022-05-21");
		driver.findElement(By.id("applyleave_txtToDate")).clear();
		driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2022-05-24");

		driver.findElement(By.id("applyBtn")).click();
		// check the applied leaves
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		driver.findElement(By.xpath("//input[@id='calFromDate']")).clear();
		driver.findElement(By.xpath("//input[@id='calFromDate']")).sendKeys("2022-05-21");
		driver.findElement(By.xpath("//input[@id='calToDate']")).clear();
		driver.findElement(By.xpath("//input[@id='calToDate']")).sendKeys("2022-05-24");

		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();

		// driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

		driver.quit();

	}

}