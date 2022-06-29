package a3_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A17_Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.get("https://djangovinoth.pythonanywhere.com/login/");
		WD.findElement(By.name("username")).sendKeys("Ram@2022");
		WD.findElement(By.name("password")).sendKeys("Dhaswin@122021");
		WD.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	    WD.get("https://djangovinoth.pythonanywhere.com/labhome/");
	     WebElement Actionslink=WD.findElement(By.id("element20"));
	     Actionslink.click();
	     WD.findElement(By.id("element21")).click();
	     Actions a=new Actions(WD);
	 WebElement b=WD.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/div[3]"));
	 a.clickAndHold(b).build().perform();
	 a.moveToElement(b, 100, 120).build().perform();
	 a.release().build().perform();
	 
	 
	 
	     
	}

}
