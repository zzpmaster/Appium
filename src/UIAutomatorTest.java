import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> aDriver = capablities();
		
		
		//aDriver.findElementByAndroidUIAutomator("attribute(\"value\")");
		aDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		aDriver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		// Validate clickable feature for all options
		// aDriver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		// [debug] [BaseDriver] Valid locator strategies for this request: xpath, id, class name, accessibility id, -android uiautomator
		System.out.println(aDriver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());	// error
	}

}
