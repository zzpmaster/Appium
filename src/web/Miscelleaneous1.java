package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 下拉框选择
 * dropdown options
 * @author zzp
 *
 */
public class Miscelleaneous1 {

	public static void main(String[] args) {
		
		// /Users/zzp/dev/Appium/geckodriver
		// C:\\Users\\zhongpeng.zhang\\Documents\\Appium\\geckodriver.exe
		System.setProperty("webdriver.gecko.driver","/Users/zzp/dev/Appium/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		
		driver.findElement(By.xpath("//*[@id='m_rtxtEmail1']")).sendKeys("aa");
		
		//显式等待,就是明确的要等到某个元素的出现或者是某个元素的可点击等条件,等不到,就一直等,除非在规定的时间之内都没找到,那么就跳出Exception.
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='m_frmRegister']/div[1]/ul")));
		
		driver.findElement(By.xpath("//*[@id='m_frmRegister']/div[1]/ul/li[6]")).click();
		
	}
}
