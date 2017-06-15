import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	public static AndroidDriver<AndroidElement> capablities() throws MalformedURLException {
		/**
		 * prepare 
		 * Make sure your Appium server is started 
		 * Make sure your emulator is opend
		 * 
		 * My desired capabilities: 
		 * 1. open emulator 
		 * 2. set App 
		 * 3. connection step to server
		 * 
		 */
		File file = new File("src/ApiDemos-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo"); // 1
		capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath()); // 2

		AndroidDriver<AndroidElement> aDriver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), capabilities); // 3
		aDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return aDriver;
	}

}
