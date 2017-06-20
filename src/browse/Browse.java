package browse;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browse extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> aDriver = capablities();
		
		aDriver.get("https://www.baidu.com/");
		
		aDriver.findElementByXPath("//*[@id='index-kw']").sendKeys("hello world");
		aDriver.findElementById("index-bn").click();
		
		// aDriver.findElementByCssSelector("a[title='Home']").click();
	}
}
