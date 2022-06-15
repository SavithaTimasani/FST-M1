package HRMProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRM_Activity3 {

	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
        
        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        //Type credentials
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");
        //Click Log in
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        
        //Check the title of the page
        String title = driver.getTitle();
        
        //Print the title of the page
        System.out.println("Page title is: " + title);
        
        //Verify that the homepage has opened.
            String homeIcon = driver.findElement(By.xpath("//a[contains(@id, 'menu_admin')]")).getText();
    		   System.out.println("Home page is opened as " + homeIcon);
        
        //Close browser
        driver.close();

    }
}