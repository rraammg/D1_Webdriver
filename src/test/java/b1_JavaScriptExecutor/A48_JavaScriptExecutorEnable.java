package b1_JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A48_JavaScriptExecutorEnable {

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
WD.findElement(By.name("element30")).click();
WD.findElement(By.name("element35")).click();
WebElement a= WD.findElement(By.id("dis"));
WebElement c=WD.findElement(By.id("ena"));
JavascriptExecutor b=(JavascriptExecutor)WD;
b.executeScript("arguments[0].removeAttribute('disabled')", a);
b.executeScript("arguments[0].setAttribute('disabled','true')", c);//to set attribute we need two aruguments


	}

}
