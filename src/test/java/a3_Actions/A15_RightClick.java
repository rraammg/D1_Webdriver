package a3_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A15_RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.get("https://djangovinoth.pythonanywhere.com/login/");
		WD.findElement(By.name("username")).sendKeys("Ram@2022");
		WD.findElement(By.name("password")).sendKeys("Dhaswin@122021");
		WD.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	    WD.get("https://djangovinoth.pythonanywhere.com/labhome/");
	    WD.findElement(By.id("element20")).click();
	    WD.findElement(By.id("element23")).click();
	    Actions a=new Actions(WD);
	    Thread.sleep(2000);
	  WebElement b= WD.findElement(By.xpath("//p[@class='card-text']"));
	  a.contextClick(b).build().perform();
	   
		
		
		
	}
	

}
