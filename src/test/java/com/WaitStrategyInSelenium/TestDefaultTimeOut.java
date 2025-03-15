package com.WaitStrategyInSelenium;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDefaultTimeOut {
  @Test
  public void testTimeOuts()
  {
	  
	  //all capabilities
	  ChromeDriver driver1=new ChromeDriver();
	  Capabilities cap=driver1.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  System.out.println(allCap);
	  
	 // timeouts={implicit=0, pageLoad=300000, script=30000}
	 
	  driver1.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
	 driver1.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	 driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver1.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  /*
	   * {acceptInsecureCerts=false,
	   *  browserName=chrome, 
	   *  browserVersion=134.0.6998.89,
	   *   chrome={chromedriverVersion=134.0.6998.88 (7e3d5c978c6d3a6eda25692cfac7f893a2b20dd0-refs/branch-heads/6998@{#1898}), userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir20996_1289574664}, 
	   *   fedcm:accounts=true, 
	   *   goog:chromeOptions={debuggerAddress=localhost:55311}, 
	   *   networkConnectionEnabled=false, 
	   *   pageLoadStrategy=normal,
	   *    platformName=windows, 
	   *    proxy=Proxy(), 
	   *    se:cdp=ws://localhost:55311/devtools/browser/5d7dafb8-ab44-4f0b-a124-309322601fe7,
	   *     se:cdpVersion=134.0.6998.89, setWindowRect=true, 
	   *     strictFileInteractability=false, 
	   *     timeouts={implicit=0, pageLoad=300000, script=30000}, 
	   *     unhandledPromptBehavior=dismiss and notify, 
	   *     webauthn:extension:credBlob=true,
	   *      webauthn:extension:largeBlob=true, 
	   *   webauthn:extension:minPinLength=true,
	   *  webauthn:extension:prf=true,
	   *   webauthn:virtualAuthenticators=true}
	   
	  
	  EdgeDriver driver2=new EdgeDriver();
	  Capabilities cap2=driver2.getCapabilities();
	  Map<String,Object> allCap2=cap2.asMap();
	  System.out.println(allCap2);
	  
	  FirefoxDriver driver3=new FirefoxDriver();
	  Capabilities cap3=driver3.getCapabilities();
	  Map<String,Object> allCap3=cap3.asMap();
	  System.out.println(allCap3);
	  */
	  
  }
}
