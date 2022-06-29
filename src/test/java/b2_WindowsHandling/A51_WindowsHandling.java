package b2_WindowsHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A51_WindowsHandling {

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
	    WD.findElement(By.id("element6")).click();
	    WD.findElement(By.id("id1")).click();
	  Set<String> a= WD.getWindowHandles();
	 Iterator<String> IT= a.iterator();
	String Parent= IT.next();
	String Google=IT.next();
	String Bing=IT.next();
	String Vmetry=IT.next();
	WD.switchTo().window(Bing);
	System.out.println(WD.getTitle());
	WD.switchTo().window(Parent);
	System.out.println(WD.getTitle());
	  
	  
	    
	    
	}

}
