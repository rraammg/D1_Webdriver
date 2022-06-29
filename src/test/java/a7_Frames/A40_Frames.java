package a7_Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A40_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WD.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		WD.switchTo().frame("globalSqa");
		WD.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div[2]/div[1]/a/div/div/div[1]/img")).click();
		
	}

}
