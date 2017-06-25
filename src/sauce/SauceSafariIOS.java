package sauce;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SauceSafariIOS {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion","10.3");
		caps.setCapability("appiumVersion", "1.6.5");
		caps.setCapability("deviceName","iPhone 6 Simulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("app","sauce-storage:UICatalog.zip");
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
				new URL("http://zzpmaster:0d60d7c9-226b-4198-8600-7a25d3cafab6@ondemand.saucelabs.com:80/wd/hub"), caps);
		
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@value='Text Entry']").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello, zhang");
		driver.findElementByName("OK").click();
		driver.navigate().back();
		
		driver.quit();
	}
}
