package browse;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CricbuzzBrowse extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capablities();
		
		driver.get("http://cricbuzz.com");
		
		driver.findElementByXPath("//a[@href='#menu']").click();
		
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 480)", "");
		
		//driver.findElement(By.xpath("//*[@id='top']/div/div[10]/h4"));
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
	}
}
