package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class test1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.driver.gecko","C:\\Users\\Acer\\Downloads\\New folder (3)\\geckodriver.exe");
		WebDriverManager. firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		

	}

}
