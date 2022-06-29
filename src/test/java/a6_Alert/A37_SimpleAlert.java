package a6_Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A37_SimpleAlert {

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
	    WD.findElement(By.id("element1")).click();
	    WD.findElement(By.id("element7")).click();
	    WD.findElement(By.id("id1")).click();
	 Alert  a=WD.switchTo().alert();
	 a.accept();
	 
	}

}
