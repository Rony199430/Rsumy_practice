package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/// THIS WILL ONLY WORK ONLY IF THE SELECT TAG IS PRESENT FOR DROPDOWN
		// STATIC DROPWON CAN BE HANDLED BY 3 WAY 
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//dropdown with select tag = select tag is static dropdown 
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //line after line 20, pass this to 20
		Select dropdown = new Select(staticDropDown); //creating object of select class (select class is in java by default) 
		
		dropdown.selectByIndex(3); // selecting by index 1ST WAY 
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");// Selecting by visible text 2ND WAY 
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		
		dropdown.selectByValue("USD"); // Select by value 3RD WAY 
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		
		
		
		
		
		
		
		
	}

}
