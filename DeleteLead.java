package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
						
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
						
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
						
		//Maximize the window
		driver.manage().window().maximize();
				
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
				
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9999");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		//Capture lead ID of First Resulting lead
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(text);
		
		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		//Verify message "No records to display" in the Lead List
		String text1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text1);
		
		//Close the browser
		driver.close();

	}

}
