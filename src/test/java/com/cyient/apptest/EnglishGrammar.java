package com.cyient.apptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EnglishGrammar {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "john");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("app", "C:\\Users\\ADITYA\\Desktop\\Automation\\Component\\AppiumFolder\\com.ssstudio.grammarhandbook_2020-09-07.apk");
		cap.setCapability("udid", "emulator-5554");
		//cap.setCapability("platformVersion", "V1.0");
		 AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 
		 driver.findElementByAndroidUIAutomator("UiSelector().text(\"GRAMMAR AND TEST\")").click();
		     String visibleText = "Active and Passive Voice";
	        driver.findElementByAndroidUIAutomator
	        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
	       // driver.findElementByAndroidUIAutomator("UiSelector().text(\"Active and Passive Voice\").index(0)").click();  
	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Rules Of Active and Passive Voice\").index(0)").click();  
	        
	        String visiblText = "android.widget.TextView";
	        driver.findElementByAndroidUIAutomator
	        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visiblText + "\").instance(0))").click();
		
	}

}
