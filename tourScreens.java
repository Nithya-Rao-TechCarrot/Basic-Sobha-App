

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class tourScreens{
	
	WebDriver driver;
	
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("BROWSER_NAME", "Android");
//		capabilities.setCapability("VERSION", "4.4.2"); 
		capabilities.setCapability("deviceName","Pixel 7 API 32");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app", "C:\\app-release.apk");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("autoGrantPermissions", true);
	 
	   
	   capabilities.setCapability("appPackage", "com.onesobhaapp");
	
		capabilities.setCapability("appActivity","com.onesobhaapp.MainActivity"); 
	//Create RemoteWebDriver instance and connect to the Appium server
	 
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	public void testOne() {
		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id=\"__CAROUSEL_ITEM_0_READY__\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
		
	}
	
	public void teardown(){
		//close the app
		driver.quit();
	}

	
}
