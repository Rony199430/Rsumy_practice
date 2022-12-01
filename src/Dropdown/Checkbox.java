//assertion and checkbox 


package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected()); 
		Assert.assertFalse(false); 
		//System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected()); 
		driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected());
		Assert.assertTrue(true); 
		//System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected()); 
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());
		
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox'")).size(), 6); 
		
		
		driver.close(); 
		
		
		
	}

}
