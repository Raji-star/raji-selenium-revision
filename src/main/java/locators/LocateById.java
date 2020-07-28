package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {
	
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chromedriver.exe", "conf/browser/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "conf/browser/chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.bbc.co.uk/bitesize");
						
		String pagetitle= driver.getTitle();
		 		 
		System.out.println(pagetitle);
		
		WebElement searchele= driver.findElement(By.id("orb-search-q"));
		//WebElement emailElement = driver.findElement(By.id("email"));
		
		searchele.sendKeys("daily lessons");
		
		
		
		
		
		
		
		
		
	}

}
