package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
		
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jj");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jeon");
		
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8754685117");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Jeon123@");
		
		//Handle all the three drop downs
		driver.findElement(By.xpath("(//option[@value='10'])[1]")).click();
		driver.findElement(By.xpath("//option[text()='Apr']")).click();
		driver.findElement(By.xpath("//option[text()='1997']")).click();
		
		//Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
