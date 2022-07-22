package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
														
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
														
		//Load the URL
		driver.get("http://leafground.com/pages/Image.html");
														
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click on this image to go home page
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		//Am I Broken Image?
		WebElement image = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if(image.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Yes, The image is broken");
		}else {
			System.out.println("No, The image is not broken");
		}
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

	}

}
