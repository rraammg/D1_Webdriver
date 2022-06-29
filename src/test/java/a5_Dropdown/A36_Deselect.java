package a5_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A36_Deselect {

	public static void main(String[] args) throws InterruptedException {
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
	    WD.findElement(By.id("element10")).click();
	    WD.findElement(By.id("element11")).click();
	WebElement   a=WD.findElement(By.id("days"));
	Select b=new Select(a);
	b.selectByValue("Tuesday");
	b.selectByIndex(5);
	b.selectByVisibleText("Monday");
	Thread.sleep(2000);
	b.deselectByIndex(5);
	b.deselectByValue("Tuesday");
	b.deselectByVisibleText("Monday");
	}

}
