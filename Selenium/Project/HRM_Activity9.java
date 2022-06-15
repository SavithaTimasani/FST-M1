package HRMProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Activity9 {

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
		driver.findElement(By.linkText("Emergency Contacts")).click();
		List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"frmEmpDelEmgContacts\"]"));
		for (WebElement headers : header) {
			System.out.println(headers.getText());
		}
		
		driver.close();
	}
}