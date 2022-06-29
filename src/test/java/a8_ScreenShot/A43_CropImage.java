package a8_ScreenShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A43_CropImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver WD=new ChromeDriver();
		WD.manage().window().maximize();
		WD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WD.get("https://www.google.com/");
	WebElement	a=WD.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	Dimension b=a.getSize();
	int x=b.height;
	int y=b.width;
	Point c=a.getLocation();
	int z=c.x;
	int v=c.y;
	File d=((TakesScreenshot)WD).getScreenshotAs(OutputType.FILE);
	BufferedImage e=ImageIO.read(d);
BufferedImage f=e.getSubimage(z, v, y, x);
ImageIO.write(f, "png", d);
FileHandler.copy(d, new File("C:\\Users\\Admin\\eclipse-workspace\\D1_Webdriver\\Screenshot\\google.png"));

	
	
	}

}
