package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Downloads\\chrome104.5\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver sk=new ChromeDriver();
		sk.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}
}
