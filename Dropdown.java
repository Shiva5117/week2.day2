package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
																		
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
																		
		//Load the URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");
																		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Select dropdown by index
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select d1 = new Select(drop1);
		d1.selectByIndex(2);
		
		//Select dropdown by text
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select d2 = new Select(drop2);
		d2.selectByVisibleText("UFT/QTP");
		
		//select dropdown by value
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select d3 = new Select(drop3);
		d3.selectByValue("4");
		
		//Count no of dropdowns
		WebElement drop4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select d4 = new Select(drop4);
		int size = d4.getOptions().size();
		System.out.println("No of dropdown: "+size);
		
		//Select dropdown using sendkeys
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium"+Keys.ENTER);
		
		//Select your progrms
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[2]")).click();

	}

}
