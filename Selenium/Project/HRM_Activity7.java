package HRMProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Activity7 {

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
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.linkText("Qualifications")).click();
		driver.findElement(By.id("addWorkExperience")).click();
		driver.findElement(By.id("experience_employer")).sendKeys("savita");

     	driver.findElement(By.id("experience_jobtitle")).sendKeys("TestLead");
     	driver.findElement(By.id("experience_from_date")).clear();
     	driver.findElement(By.id("experience_from_date")).sendKeys("2010-02-17");
     	driver.findElement(By.id("experience_to_date")).clear();
     	driver.findElement(By.id("experience_to_date")).sendKeys("2022-06-14");
     	driver.findElement(By.id("experience_comments")).sendKeys("IBMInvoation");
     	driver.findElement(By.id("btnWorkExpSave")).click();
     	driver.quit();
     	
	}
	

}