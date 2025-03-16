package com.Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllCapabilitiesTest {
  @Test
  public void testCapabilities() 
  {
	  
	  ChromeDriver driver=new ChromeDriver();
	  	Capabilities cap=driver.getCapabilities();
	  	Map<String,Object> allCap=cap.asMap();
	  	System.out.println(allCap);
	  	
	  	
	  	
	  	/*
	  	 * {acceptInsecureCerts=false,
	  	 *  browserName=chrome,
	  	 *   browserVersion=134.0.6998.89,
	  	 *    chrome={chromedriverVersion=134.0.6998.88
	  	 *     (7e3d5c978c6d3a6eda25692cfac7f893a2b20dd0-refs/branch-heads/6998@{#1898})
	  	 *     , userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir29184_482476628}, 
	  	 *     fedcm:accounts=true,
	  	 *      goog:chromeOptions={debuggerAddress=localhost:56579}, 
	  	 *      networkConnectionEnabled=false, 
	  	 *      pageLoadStrategy=normal, platformName=windows,
	  	 *       proxy=Proxy(),
	  	 *        se:cdp=ws://localhost:56579/devtools/browser/21886e5e-dc8a-4272-bc8f-f6b10127ae26, 
	  	 *        se:cdpVersion=134.0.6998.89, 
	  	 *        setWindowRect=true, 
	  	 *        strictFileInteractability=false, 
	  	 *        timeouts={implicit=0, pageLoad=300000, script=30000}, 
	  	 *        unhandledPromptBehavior=dismiss and notify,
	  	 *         webauthn:extension:credBlob=true,
	  	 *          webauthn:extension:largeBlob=true,
	  	 *           webauthn:extension:minPinLength=true, 
	  	 *           webauthn:extension:prf=true, 
	  	 * webauthn:virtualAuthenticators=true}
	  	 */
	  	
  }
  
}
