package elementInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxInteraction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "conf/browser/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://uk.ixl.com/");
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		driver.manage().window().maximize();
		
		WebElement firstnameele=driver.findElement(By.xpath("//*[@id=\"qlusername\"]"));
		Thread.sleep(5000);
		firstnameele.sendKeys("rajeshwarireddy");
		Thread.sleep(5000);
		firstnameele.clear();
		firstnameele.getText();
		
		
	}

}
