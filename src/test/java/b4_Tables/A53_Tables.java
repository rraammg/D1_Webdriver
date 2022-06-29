package b4_Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A53_Tables {

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
	    WD.findElement(By.id("element39")).click();
	    WD.findElement(By.id("element40")).click();
	   WebElement a=WD.findElement(By.id("table1"));
	  List<WebElement> row=a.findElements(By.tagName("tr"));
	  for(int i=0;i<row.size();i++)
	  {
	List<WebElement> column=row.get(i).findElements(By.tagName("td"));
	for(int j=0;j<column.size();j++)
	{
		String b=column.get(j).getText();
		System.out.print(b+" ");
	}
	System.out.println();
		  
	  }
	    
	    
	}

}
