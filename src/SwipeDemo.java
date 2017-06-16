import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> aDriver = capablities();

		aDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		aDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();

		aDriver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		aDriver.findElementByXPath("//*[@content-desc='9']").click();

		TouchAction action = new TouchAction(aDriver);
		action.press(aDriver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofMillis(2000))
				.moveTo(aDriver.findElementByXPath("//*[@content-desc='45']")).release().perform();

	}

}
