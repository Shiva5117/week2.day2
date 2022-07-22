package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.model.geojson.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
										
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
										
		//Load the URL
		driver.get("http://leafground.com/pages/Button.html");
										
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click button to travel home page
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		
		//Go back to button
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		//Find position of button (x,y)
		WebElement position = driver.findElement(By.xpath("//button[@id='position']"));
		org.openqa.selenium.Point xy = position.getLocation();
		int xposition = xy.getX();
		int yposition = xy.getY();
		System.out.println("X-Position = "+xposition +"\nY-Position = "+yposition);
		
		//Find button color
		WebElement color = driver.findElement(By.xpath("//button[@id='color']"));
		String bcolor = color.getCssValue("background-color");
		System.out.println("\n"+bcolor);
		
		//Find the height and width
		WebElement size = driver.findElement(By.xpath("//button[@id='size']"));
		int h = size.getSize().getHeight();
		int w = size.getSize().getWidth();
		System.out.println("\nHeight = "+h +"\nWidth = "+w);

	}

}
