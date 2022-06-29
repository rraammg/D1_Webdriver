	package a4_ElementSet1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A26_RadioButton {

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
	    WD.findElement(By.id("element4")).click();
	 List<WebElement> a=WD.findElements(By.name("technology1"));
	 for(int i=0;i<a.size();i++)
	 {
		String b=a.get(i).getAttribute("value");
		System.out.println(b);
		if(b.equals("Flask"))
		{
			a.get(i).click();
			
		}
	 }
	}

}
