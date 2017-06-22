package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Miscelleaneous {

	public static void main(String[] args) {
		
		// /Users/zzp/dev/Appium/geckodriver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zhongpeng.zhang\\Documents\\Appium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		By by = By.xpath(".//*[@id='recaptcha-anchor']/div[5]");
		int number = findFrameNumber(driver, by);
		driver.switchTo().frame(number);
		driver.findElement(by).click();
		
		driver.switchTo().defaultContent();
		By by1 = By.xpath(".//*[@id='recaptcha-verify-button']");
		int number1 = findFrameNumber(driver, by1);
		driver.switchTo().frame(number1);
		driver.findElement(by1).click();
	}
	
	public static int findFrameNumber(WebDriver driver, By by) {
		
		int count = driver.findElements(By.tagName("iframe")).size();
		int i;
		for (i = 0; i < count; i++) {
			driver.switchTo().frame(i);
			
			int fcount = driver.findElements(by).size();
			
			if (fcount > 0) {
				// driver.findElement(by).click();
				break;
			} else {
				System.err.println("not found");
			}
			
		}
		driver.switchTo().defaultContent();
		
		return i;
	}
}
