package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
																				
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
																				
		//Load the URL
		driver.get("http://www.leafground.com/pages/table.html");
																				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Get the count of number of columns
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnCount = column.size();
		System.out.println("No of columns in the table: "+columnCount);
		
		//Get the count of number of rows
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println("\nNo of rows in the table: "+rowCount);
		
		//Get the progress value of 'Learn to interact with Elements'
		WebElement progress = driver.findElement(By.xpath("(//td[normalize-space()='Learn to interact with Elements']//following::td[1])[1]"));
		String progValue = progress.getText();
		System.out.println("\nValue of Learn to interact with Elements[1] = "+progValue);
		
		WebElement progress1 = driver.findElement(By.xpath("(//td[normalize-space()='Learn to interact with Elements']//following::td[1])[2]"));
		String progValue1 = progress1.getText();
		System.out.println("Value of Learn to interact with Elements[2] = "+progValue1);
		
		WebElement progress2 = driver.findElement(By.xpath("(//td[normalize-space()='Learn to interact with Elements']//following::td[1])[3]"));
		String progValue2 = progress2.getText();
		System.out.println("Value of Learn to interact with Elements[2] = "+progValue2);
		
		//Check the vital task for the least completed progress
		List<WebElement> progValues = driver.findElements(By.xpath("//td[2]"));
		List<Integer> arr = new ArrayList<Integer>();
		
		for (WebElement webElement : progValues) {
			String text = webElement.getText().replace("%", "");
			arr.add(Integer.parseInt(text));
		}
		int minimum = Collections.min(arr);
		String minValue = Integer.toString(minimum)+"%";
		
		String xpath = "//td[normalize-space()="+"\""+minValue+"\""+"]//following::td[1]";
		driver.findElement(By.xpath(xpath)).click();
		

	}

}
