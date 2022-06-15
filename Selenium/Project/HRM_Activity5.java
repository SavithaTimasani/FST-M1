package HRMProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HRM_Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
		
		//enter first name
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("savita");
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
		//enterlastname
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("timasani");
		// select the gender
		driver.findElement(By.xpath("//input[@id='personal_optGender_2']")).click();
		WebElement dropdown = driver.findElement(By.id("personal_cmbNation"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Indian");
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys("1985-01-10");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.close();
	}

}