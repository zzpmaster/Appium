import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo1 extends base{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> aDriver = capablities();
		
		// xpath id className, AndroidUIautomator
		/**
		 *  xpath syntax
		 *  //tagName[@attribute='value']
		 *  
		 */
		aDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		aDriver.findElementByXPath("//android.widget.TextView[@index=2]").click();
		aDriver.findElementById("android:id/checkbox").click();
		aDriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		aDriver.findElementByClassName("android.widget.EditText").sendKeys("world");
		aDriver.findElementsByClassName("android.widget.Button").get(1).click();
	}
	
}
