import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> aDriver = capablities();
		
		aDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"))");
		
	}

}
