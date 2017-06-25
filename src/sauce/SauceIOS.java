package sauce;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SauceIOS {

	/**
	 * https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/
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
		caps.setCapability("browserName", "Safari");
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
				new URL("http://zzpmaster:0d60d7c9-226b-4198-8600-7a25d3cafab6@ondemand.saucelabs.com:80/wd/hub"), caps);
		
		driver.get("https://www.apple.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
