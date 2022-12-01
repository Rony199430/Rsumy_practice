import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getpassword (driver); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait right after driver. here declared globally 
		driver.get("https://rahulshettyacademy.com/locatorspractice"); 
		driver.findElement(By.id("inputUsername")).sendKeys(name); // Locator by ID 
		driver.findElement(By.name("inputPassword")).sendKeys(password); // Locator by name 
		driver.findElement(By.className("signInBtn")).click(); //Locator by class name 
		Thread.sleep(2000); 
		System.out.println(driver.findElement(By.tagName("p")).getText()); 
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); //comparing the text that have been retrieved
		driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		//any element based on its text by x path //button[text()='value'] 
		// no css selector to identify an element based on text 
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
				
	}
	
	
	public static String getpassword (WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = (driver.findElement(By.cssSelector("form p")).getText());
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String passwordArry[]= passwordtext.split("'");
		String passwordArry2 [] = passwordArry [1].split("'");
		String password = passwordArry2 [0];
		return password; 
		
	}

}
