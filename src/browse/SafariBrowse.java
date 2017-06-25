package browse;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * mobile safari browse
 * @author zzp
 *
 */
public class SafariBrowse {

	@Test
	public void brows() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.apple.com");
		
		driver.get("http://gmail.com");

//		driver.findElementByName("Email").sendKeys("zzp");
//
//		driver.findElementByName("Passwd").sendKeys("zzp");
//
//		driver.findElementByName("signIn").click();
	}
}
