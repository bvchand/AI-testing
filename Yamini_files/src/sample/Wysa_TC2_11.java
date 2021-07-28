package sample;

import sample.WysaMain.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
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
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
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

import java.time.Duration;

public class Wysa_TC2_11 {
	static void tc211(DesiredCapabilities dc, AndroidDriver<AndroidElement> driver, WebDriverWait wait) throws IOException {
        driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(900)));
MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Wysa");
		
		el1.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
//		el2.click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement el2a = (MobileElement) driver.findElementByAccessibilityId("Remote\nWellness");
		el2a.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Self Awareness");

//(MobileElement) //driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Urge //Surfing\"]");
		el3.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement el3a = (MobileElement) driver.findElementByAccessibilityId("Start");
		el3a.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Reply or say help…");
		el4.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Reply or say help…");
		el5.sendKeys("DRS$$%^@@");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Send");
		el6.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Not really...");
		el7.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Reply or say help…");
		el8.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Reply or say help…");
		el9.sendKeys("ANR$@$2");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Send");
		el10.click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		
//		MobileElement el10a = (MobileElement) driver.findElementByAccessibilityId("Yes");
//		el10a.click();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Show self-care kit");
		el11.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Finished automation.");
		System.out.println("Taking a screenshot!");
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //takes SS of screen
		FileUtils.copyFile(scrFile2, new File("2.11" + ".jpg"));
		System.out.println("Screenshot taken and saved to folder.");
		String video = driver.stopRecordingScreen();

        byte[] decode = Base64.getDecoder().decode(video);

        FileUtils.writeByteArrayToFile(new File("2.11.mp4"), decode);
        System.out.println("Recording done");
        driver.quit();
        	}
        }
	}
}