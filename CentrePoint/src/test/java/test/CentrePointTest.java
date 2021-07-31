package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CentrePointTest {
	
	public static void main(String args[]) throws MalformedURLException {
		
DesiredCapabilities dcap = new DesiredCapabilities();
		
		dcap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-M215F/DS");
		dcap.setCapability(MobileCapabilityType.UDID, "RZ8N31VPB1W");
		dcap.setCapability("appPackage", "com.landmarkgroup.centrepointstores");
		dcap.setCapability("appActivity", "com.landmarkgroupreactapps.MainActivity");
		dcap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
		dcap.setCapability("noReset", true);
		
		AndroidDriver<AndroidElement> driver;
		try {
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dcap);
		
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("tiSearchInput");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"Department\"])[6]");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"category\"])[1]");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"imgundefined\"])[1]/android.view.ViewGroup/android.widget.ImageView");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("ttlAddToBasketButton");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("txtStartShoppingButton");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("ttlAddToBasketButton");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("btnCheckoutNow");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("ttlRemoveButton");
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("ttlStartShopping");
		el11.click();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
