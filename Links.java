package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		//Download and set the path
		WebDriverManager.chromedriver().setup();
												
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
												
		//Load the URL
		driver.get("http://leafground.com/pages/Link.html");
												
		//Maximize the window
		driver.manage().window().maximize();
		
		//Go to Home Page
		driver.findElement(By.linkText("Go to Home Page")).click();
		count++;
		
		//Go back to hyperlinks
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		//Find where am supposed to go without clicking me?
		driver.findElement(By.partialLinkText("Find where am")).click();
		String url = driver.getCurrentUrl();
		count++;
		System.out.println("I am in the page of "+url);
		
		//Go back to hyperlinks
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		//Verify am I broken?
		driver.findElement(By.partialLinkText("broken?")).click();
		count++;
		String broken = driver.getTitle();
		if (broken.equals("404 Not Found")) {
			System.out.println("\nYes, You are broken");
		}else {
			System.out.println("\nNo, You are very strong");
		}
		
		//Go to Home Page (Interact with same link name)
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		count++;
		
		//Go back to hyperlinks
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		//How many links are available in this page?
		driver.findElement(By.partialLinkText("links are available")).click();
		count++;
		System.out.println("\nNo of links available in the page: "+count);

	}

}
