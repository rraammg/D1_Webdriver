package a8_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A42_ScreeenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver WD=new ChromeDriver();
WD.manage().window().maximize();
WD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WD.get("https://www.bing.com/");
File a=((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
FileHandler.copy(a, new File("C:\\Users\\Admin\\eclipse-workspace\\D1_Webdriver\\Screenshot\\Bing.png"));

	}

}
