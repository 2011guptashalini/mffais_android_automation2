package com.browserstack.suite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.browserstack.BrowserStackTestNGTest;


public class AppKeyWords extends BrowserStackTestNGTest {
	SoftAssert 	softAssertion = new SoftAssert();
	public void checkSpent() throws InterruptedException
	{
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
        Thread.sleep(15000); 
        //Thread.sleep(15000); 
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
        Thread.sleep(5000);
        ////dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys("200");
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("bill1");
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys("20");
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILE\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Start Reconcile\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").sendKeys("150");
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"bill1\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILATION IS DONE\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"SPENT\")").click();
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"View History\")").click();
        softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"bill1\")").isDisplayed()));
        softAssertion.assertAll();
	}
	
	
	
	public void addABillWithSaving(String addAccountBal, String addBillAmount) throws InterruptedException{
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
        Thread.sleep(15000); 
        //Thread.sleep(15000); 
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
        Thread.sleep(5000);
        ////dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
        //dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView").click();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Round Up\")").click();
        
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();              
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("aaa");
        ////dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addBillAmount);
        //dr.hideKeyboard();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
        Thread.sleep(5000);
        //dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]/android.widget.TextView").click();
        //.sleep(5000);
        //dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Round Up\")").click();
        
        //dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
              
        
        float temp1 = Float.parseFloat(addAccountBal);
        float temp2 = Float.parseFloat(addBillAmount);
        double d = Double.parseDouble(addAccountBal);
        float temp3= (float) Math.ceil(d);
        
        float expectedAvlBal = temp1 -temp3;
        Thread.sleep(5000);	
        String actualavlBal =  dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]").getText();
        String newString = actualavlBal.substring(1);
        float actualBalfl = Float.parseFloat(newString);
        softAssertion.assertEquals((int)actualBalfl, (int)expectedAvlBal);
        softAssertion.assertAll();
        
        /*if (expectedAvlBal == actualBalfl )
        {
     	   System.out.println("Actual Balance is equal to expected balance");
        }
        else
        {
     	   System.out.println("Actual Balance is NOT equal to expected balance");
        }*/
	}
	
	

public void CheckingAlertsAndErrors() throws InterruptedException
{
	  dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      Thread.sleep(15000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      Thread.sleep(100);
      softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Alert\")").isDisplayed()), "Alert Is Displayed");
      System.out.println("First Alert of the test");
      /*if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Alert\")").isDisplayed())
      {
      	System.out.println("Alert Displayed, user has to fill NAME");
      }
      else
      {
      	System.out.println("Alert not displayed, FAIL");
      }*/
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("negativeScenarios");
	       
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      Thread.sleep(100);
      softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Alert\")").isDisplayed()), "Alert Is Displayed");
      System.out.println("Second Alert of the test");
      /*if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Alert\")").isDisplayed())
      {
      	System.out.println("Alert Displayed, user has to provide account balance");
      }
      else
      {
      	System.out.println("Alert not displayed, FAIL");
      }*/
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Bank Balance\")").sendKeys("200");
	       
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      Thread.sleep(5000);
      //dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      //Thread.sleep(100);
      
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Round Up\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
      Thread.sleep(100);
      softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Error\")").isDisplayed()), "Alert Is Displayed");
      System.out.println("First Error of the test");
      
     /* if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Error\")").isDisplayed())
      {
      	System.out.println("Error Displayed, user has to provide details");
      }
      else
      {
      	System.out.println("Error not displayed, FAIL");
      }*/
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("test");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys("19.8");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
      Thread.sleep(5000);
       
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      Thread.sleep(5000);
      Thread.sleep(5000);    
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add a Pay\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click();
      softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Error\")").isDisplayed()), "Alert Is Displayed");
      System.out.println("Second Error of the test");
      /*if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Error\")").isDisplayed())
      {
      	System.out.println("Error Displayed, user has to provide details");
      }
      else
      {
      	System.out.println("Error not displayed, FAIL");
      }*/
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter name\")").sendKeys("testemp");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys("23.7");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click();
      Thread.sleep(15000);
      //dr.findElementByAndroidUIAutomator("UiSelector().text(\"RECONCILE\")").click();
      //Thread.sleep(5000);
      //dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"FORECAST\")").click();
      //Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"GOALS\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Goal\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
      Thread.sleep(100);
      softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Error\")").isDisplayed()), "Alert Is Displayed");
      System.out.println("Third Error of the test");
      
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("test");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys("19.8");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILE\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().text(\"Start Reconcile\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().text(\"Cancel\")").click();
      //dr.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();
      dr.findElementByAndroidUIAutomator("UiSelector().text(\"Start Reconcile\")").click();
      Thread.sleep(5000);
      Thread.sleep(5000);	
      dr.findElementByAndroidUIAutomator("UiSelector().text(\"Save\")").click();
      Thread.sleep(100);
      softAssertion.assertTrue((dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Error\")").isDisplayed()), "Alert Is Displayed");
      System.out.println("Fourth Error of the test");
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").click();
      Thread.sleep(5000);
      dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").sendKeys("200");
      Thread.sleep(5000);
      
      softAssertion.assertAll();
      
      
	}

public void checkReconcilingScenario2(String addAccountBal, String billAmount1, String billAmount2, String newAccountBal) throws InterruptedException
{
    //dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    //Thread.sleep(5000);
	/** AndroidDriver has to be used now instead of AppiumDriver **/
    dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
    Thread.sleep(15000); 
   // Thread.sleep(15000); 
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    //Thread.sleep(5000);
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
             //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("bill1");
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(billAmount1);

    //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
             //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys(billAmount1);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys("15");

    //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
    Thread.sleep(5000);

    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILE\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().text(\"Start Reconcile\")").click();
    
    //dr.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();
    Thread.sleep(5000);	
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").sendKeys(newAccountBal);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click();
   
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"bill1\")").click();

    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILATION IS DONE\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"SUMMARY\")").click();
    
    softAssertion.assertTrue(dr.findElementByAndroidUIAutomator("UiSelector().text(\"$160.00\")").isDisplayed());
    softAssertion.assertAll();
        
   
	}

public void checkReconcilingScenario1(String addAccountBal, String billAmount1, String billAmount2, String newAccountBal) throws InterruptedException
{
    //dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    //Thread.sleep(5000);
	/** AndroidDriver has to be used now instead of AppiumDriver **/
    dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Thread.sleep(15000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
    //Thread.sleep(15000); 
    Thread.sleep(15000); 
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    //Thread.sleep(5000);
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
             //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("bill1");
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(billAmount1);

    //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
             //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys(billAmount1);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys("15");

    //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
    Thread.sleep(5000);

    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILE\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().text(\"Start Reconcile\")").click();
    
    //dr.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='1']")).click();
    Thread.sleep(5000);	
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter balance\")").sendKeys(newAccountBal);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click();
   
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"bill1\")").click();

    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"RECONCILATION IS DONE\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"SUMMARY\")").click();
    
    softAssertion.assertTrue(dr.findElementByAndroidUIAutomator("UiSelector().text(\"$165.00\")").isDisplayed());
     //String newString = avlbal.substring(1);
     //float actualAvlBal = Float.parseFloat(newString);
     //Assert.assertEquals((int)actualAvlBal, (int)165.00);
    softAssertion.assertAll();
     
   
	}
}


