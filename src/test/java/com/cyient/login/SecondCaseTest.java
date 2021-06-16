package com.cyient.login;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SecondCaseTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "john");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("app", "C:\\Users\\ADITYA\\Desktop\\Automation\\Component\\Appiumm\\com.meritnation.ncert_2020-12-03.apk");
		cap.setCapability("udid", "emulator-5554");
		//cap.setCapability("platformVersion", "V1.0");
		 AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("UiSelector().text(\"LOGIN\")").click();
		 Thread.sleep(2000);
		driver.findElementByXPath("//*[@resource-id='com.meritnation.ncert:id/etLoginId']").sendKeys("Miller@gmail.com");
		driver.findElementByXPath("//*[@resource-id='com.meritnation.ncert:id/etPassword']").sendKeys("9876789076");
		// driver.findElementByAndroidUIAutomator("UiSelector().text(\"Email ID / Mobile\")").sendKeys("965087890");
		 
		 driver.findElementByAndroidUIAutomator("UiSelector().text(\"LOGIN\").index(3)").click();
	}

}
