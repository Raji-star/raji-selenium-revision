package elementInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		 
        System.setProperty("webdriver.chrome.driver", "conf/browser/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://uk.ixl.com/");
		
		driver.get("https://www.facebook.com/");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		driver.manage().window().maximize();
		
	    WebElement signinele=driver.findElement(By.xpath("//*[@id=\"u_0_10\"]/span[2]/label"));
		//Thread.sleep(5000);
		//signinele.submit();
	    signinele.click();
		
	}

}
