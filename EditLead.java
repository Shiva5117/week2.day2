package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		//Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Shiva");
		
		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		
		//Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		
		//Verify title of the page
		String title = driver.getTitle();
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title page is verified");
		}
		
		//Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Change the company name
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Infosys");
		
		//Click Update
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		//Confirm the changed name appears
		String compName = driver.findElement(By.xpath("//span[contains(text(),'Infosys')]")).getText();
		System.out.println(compName);
		if (compName.contains("Infosys")) {
			System.out.println("CompanyName is changed");
		}
		
		//Close the browser
		driver.close();

	}

}
