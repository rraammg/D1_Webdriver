package a4_ElementSet1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A25_Checkbox {

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
	    WD.findElement(By.id("element3")).click();
	  WebElement a=  WD.findElement(By.id("BigData"));
	  //WD.findElement(By.id("Django")).click();
	  if(a.isDisplayed())
	  {
		  System.out.println("IS DISPLAYED");
	  }
	  if(a.isEnabled())
	  {
		  System.out.println("IS ENABLED");
	  }
	  if(!a.isSelected())
	  {
		  System.out.println("CHECKBOX");
		  a.click();
		  
	  }
	  else
	  {
		  System.out.println("CHECKBOX IS SELECTED");
	  }
	    
	}

}
