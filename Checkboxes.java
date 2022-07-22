package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
																
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
																
		//Load the URL
		driver.get("http://leafground.com/pages/checkbox.html");
																
		//Maximize the window
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		driver.findElement(By.xpath("//div[@class='example']//input[1]")).click();
		
		//Confirm Selenium is checked
		Boolean selected = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/input")).isSelected();
		if (selected.equals(true)) {
			System.out.println("Checkbox is checked");
		}else {
			System.out.println("Checkbox is not checked");
		}
		
		//DeSelect only checked
		Boolean check = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/input[2]")).isSelected();
		if (check.equals(true)) {
			driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/input[2]")).click();
		}
		
		//Select all below checkboxes
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/input[3]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/input[4]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/input[5]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/input[6]")).click();
		
		

	}

}
