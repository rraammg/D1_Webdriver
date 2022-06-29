package a9_StaleElementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A45_StaleElementExceptionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WD.get("https://www.google.com/");
//	WebElement a=WD.findElement(By.name("q"));
//	a.sendKeys("chennai");
//	a.submit();
//	WD.navigate().back();
//	WebElement b=WD.findElement(By.name("q"));
//	b.sendKeys("guindy");
//	b.submit();
		WD.findElement(By.name("q")).sendKeys("chennai");
		WD.findElement(By.name("q")).submit();
		WD.navigate().back();
		WD.findElement(By.name("q")).sendKeys("GUINDY");
		WD.findElement(By.name("q")).submit();
		
		

	
	}

}
