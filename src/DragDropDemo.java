import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDropDemo extends base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> aDriver = capablities();

		aDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		aDriver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

		TouchAction action = new TouchAction(aDriver);

		action.longPress(aDriver.findElementById("io.appium.android.apis:id/drag_dot_1"))
				.moveTo(aDriver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();

	}

}
