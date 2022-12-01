package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		driver.findElement(By.id("autosuggest")).sendKeys("uni");
		Thread.sleep(3000); 
		List<WebElement> Countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //findElements return type is List<webelement>
		
		for (WebElement Country:Countries) //enhanced for loop
		{
			if (Country.getText().equalsIgnoreCase("United States (USA)")){
				Country.click();
				break;
			}
			
		}
		
		
		
	}

}
