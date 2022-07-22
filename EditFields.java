package week2.day2;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
								
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
								
		//Load the URL
		driver.get("http://leafground.com/pages/Edit.html");
								
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter your email address
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" text"+Keys.TAB);
		
		//Get default text entered
		String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println(text);
		
		//Clear the text
		driver.findElement(By.xpath("(//input[@value='Clear me!!'])[1]")).clear();
		
		//Confirm that edit field is disabled
		boolean enabled = driver.findElement(By.xpath("(//input[@disabled='true'])[1]")).isEnabled();
		if (enabled == false) {
			System.out.println("Edit field is diabled");
		}

	}

}
