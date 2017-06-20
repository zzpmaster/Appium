import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> aDriver = capablities();
		
		Dimension size = aDriver.manage().window().getSize();
		int x = size.getWidth() / 2;
		int starty = (int)(size.getHeight() * 0.60);
		int endy = (int)(size.getHeight() * 0.10);
		aDriver.swipe(x, starty, x, endy, 2000);
		
		aDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"))");
		
	}

}
