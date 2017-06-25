package ios;

import java.net.MalformedURLException;

import javax.naming.directory.DirContext;

import org.openqa.selenium.Dimension;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSDemo1 extends IOSBase {

	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver<IOSElement> driver = capablities();
		
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@value='Text Entry']").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello, zhang");
		driver.findElementByName("OK").click();
		driver.navigate().back();
		
		Dimension size = driver.manage().window().getSize();
		int x = size.getWidth() / 2;
		int startY = (int)(size.getHeight() * 0.60);
		int endY = (int)(size.getHeight() * 0.10);
		driver.swipe(x, startY, x, endY, 2000);
		driver.findElementByAccessibilityId("Steppers").click();
		
		driver.findElementByAccessibilityId("Increment").click();
		driver.findElementByAccessibilityId("Increment").click();
		System.err.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		
		driver.findElementByAccessibilityId("Decrement").click();
		System.err.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());
		driver.navigate().back();
		
		
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByName("Green color component value").sendKeys("65");
		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("25");
		
		
	}
}
	