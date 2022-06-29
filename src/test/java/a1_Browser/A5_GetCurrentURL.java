package a1_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_GetCurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.get("http://www.google.com");
		WD.manage().window().maximize();
		String a=WD.getCurrentUrl();
		System.out.println(a);
		
	}

}
