package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "conf/browser/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://uk.ixl.com/");
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		driver.manage().window().maximize();
		
		WebElement firstnameele=driver.findElement(By.linkText("Analytics"));
		Thread.sleep(5000);
		firstnameele.click();
		
		
	}

}
