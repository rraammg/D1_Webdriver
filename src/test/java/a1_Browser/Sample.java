package a1_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\C1_WebDriver\\browserdrive\\chromedriver.exe");
		//WebDriver WD=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
	}

}
