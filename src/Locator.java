import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait right after driver. here declared globally 
		driver.get("https://rahulshettyacademy.com/locatorspractice"); 
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); // Locator by ID 
		driver.findElement(By.name("inputPassword")).sendKeys("12345nh"); // Locator by name 
		driver.findElement(By.className("signInBtn")).click(); //Locator by class name 
		driver.findElement(By.cssSelector("p.error")).getText(); //CSS selector by class 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click(); // locator by link text 
		Thread.sleep(1000); //taking 1 sec before sliding finish 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john"); //Locator by Xpath 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("johndoe@ymail.com");//Locator CSS selector generic form 2nd way to use selector 
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //using xpath selelctor indexing  
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("doejohn@gmail.com"); // using css selector indexing 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("785-958-8575");//xpath by parent child tag name and index 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // css by class name only as the class is unique
		System.out.println((driver.findElement(By.cssSelector("form p")).getText()));//css by parent child (no/ needed, just used space {for x path need /
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //combines custom x path and parent to child and indexing 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); //css by id just #id_value; we have done this earlier ny just ID 
		driver.findElement(By.cssSelector("input[type*= 'pass']")).sendKeys("rahulshettyacademy"); //dynamic attributes (locating by partial attribute value) 
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();//locating xpath for dynamic text, write contains, (@attribute, 'static_value')
		//for dynamic, css is easier just write * after attribute, as for xpath write contains @attribute, 'static_valu' 
		
		
		
		
		
		
		
		
	}

}
