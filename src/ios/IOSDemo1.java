package ios;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSDemo1 extends IOSBase {

	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver<IOSElement> driver = capablities();
		
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@value='Text Entry']").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello, zhang");
		driver.findElementByName("OK").click();
		
		// 9分钟 
		
	}
}
	