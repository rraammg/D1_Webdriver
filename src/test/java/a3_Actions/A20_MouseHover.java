package a3_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A20_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WD.get("https://djangovinoth.pythonanywhere.com/login/");
		WD.findElement(By.name("username")).sendKeys("Ram@2022");
		WD.findElement(By.name("password")).sendKeys("Dhaswin@122021");
		WD.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	    WD.get("https://djangovinoth.pythonanywhere.com/labhome/");
	     WebElement Actionslink=WD.findElement(By.id("element20"));
	     Actionslink.click();
	     WD.findElement(By.id("element27")).click();
	     Actions a=new Actions(WD);
	   WebElement Resume=  WD.findElement(By.id("id11"));
	WebElement Item=   WD.findElement(By.id("id13"));
	WebElement Havoc=	WD.findElement(By.id("id17"));
	a.moveToElement(Resume).build().perform();
	a.moveToElement(Item).build().perform();
	a.moveToElement(Havoc).build().perform();
	
	
	
	}

}
