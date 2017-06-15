import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		AndroidDriver<AndroidElement> aDriver = capablities();
		
		aDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//aDriver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		//aDriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		// Tap
		TouchAction action = new TouchAction(aDriver);
		
		// perform: sends he entire sequence of events to appium
		action.tap(aDriver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		
		aDriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		// à¬èZïsï˙
		new TouchAction(aDriver).press(aDriver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofMillis(3000)).release().perform();
		
		aDriver.findElementByXPath("//android.widget.TextView[@text='Sample action']").click();
	}

}
