package elementInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInteraction {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "conf/browser/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		driver.manage().window().maximize();
		
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Thread.sleep(5000);
		Select daydropdownselect = new Select(dayelement);
		daydropdownselect.selectByValue("27");
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select monthdropdown = new Select(monthelement);
		monthdropdown.selectByVisibleText("Sept");
		//monthdropdown.selectByIndex(9);
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select yeardropdown=new Select(yearelement);
		yeardropdown.selectByValue("2018");
		
		
		
		
		
	}

}
