import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MiscellaneousDemo extends base {
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> aDriver = capablities();
		
		aDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		System.err.println(aDriver.currentActivity());
		System.err.println(aDriver.getContext());
		
		aDriver.pressKeyCode(AndroidKeyCode.BACK);
		
	}

}
