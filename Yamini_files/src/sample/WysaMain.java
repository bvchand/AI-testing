package sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class WysaMain {
	
	static void screenshot(AndroidDriver<AndroidElement> driver) throws IOException {
		System.out.println("Finished automation.");
		System.out.println("Taking a screenshot!");
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takes SS of screen
		FileUtils.copyFile(scrFile2, new File("1.3." + "2" + ".jpg"));
		System.out.println("Screenshot taken and saved to folder.");
	}
	
	public static void main(String args[]) throws MalformedURLException, IOException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability("platformName", "android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		WebDriverWait wait = new WebDriverWait(driver, 10);		

		Wysa_TC1_1.tc1(dc, driver, wait);
		Wysa_TC1_2.tc2(dc, driver, wait);
		Wysa_TC1_9.tc9(dc, driver, wait);
		Wysa_TC1_10.tc10(dc, driver, wait);
		Wysa_TC1_11.tc11(dc, driver, wait);
		Wysa_TC1_12.tc12(dc, driver, wait);
		Wysa_TC2_1.tc13(dc, driver, wait);
		Wysa_TC1_2.tc2(dc, driver, wait);
		Wysa_TC1_3.tc3(dc, driver, wait);
		Wysa_TC1_4.tc4(dc, driver, wait);
		Wysa_TC1_6.tc6(dc, driver, wait);
		Wysa_TC1_7.tc7(dc, driver, wait);
		Wysa_TC1_8.tc8(dc, driver, wait);
		Wysa_TC2_9.tc29(dc, driver, wait);
		Wysa_TC2_10.tc210(dc, driver, wait);
		Wysa_TC2_11.tc211(dc, driver, wait);
		Wysa_TC2_12.tc212(dc, driver, wait);
		wysa_op.console_message();
	}
}