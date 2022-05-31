package Logic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

import static Logic.LaunchBrowsers.*;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Random;

import Pages.HomePages;

public class HomePagesLogic {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	 /** 1.
     * Method to verify user navigated to voot home page by fetching current url & comparing with actual url.
	 * @throws InterruptedException 
     */
    public static void verifyHomePageNavigation() throws InterruptedException{
        String homePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(homePageUrl,"https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/","Not navigated to Voot home page");
        Thread.sleep(5000);
        System.out.println("Home page url is: " + homePageUrl);
    }

    /** 2.
     * method to verify voot logo by presence of element and comparing fetched logo text with actual text.
     * @throws InterruptedException 
     */
    public static void verifyVootLogo() throws InterruptedException{
       WebElement vootlogo = driver.findElement(HomePages.objSingle);
        String logoText = vootlogo.getAttribute("title");
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        System.out.println("Text of voot logo is: " + logoText);
  //      Assert.assertEquals(logoText,"Voot","Failed to fetch voot logo");
    //    Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

    }
    public static void navigateToContactus() throws InterruptedException {
//    	Thread.sleep(5000);
//    	driver.findElement(HomePages.objContactus).click();
//    	Select select = new Select(driver.findElement(HomePages.objsubjectheading));select.selectByIndex(2);
    	
    
//        driver.findElement(HomePages.objSingle).click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,350)", "");
    	driver.findElement(HomePages.objNoOfDepen).click();
    	WebElement dropdown =driver.findElement(HomePages.objNoOfDepen);
    	Select select = new Select(dropdown);
    	select.selectByIndex(0);	
    	driver.findElement(HomePages.objAnnualIncome).clear();
    	driver.findElement(HomePages.objHometoLivein).click();
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objAnnualIncome).sendKeys("80,000");
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objAnnualOtherIncome).clear();
    	driver.findElement(HomePages.objAnnualOtherIncome).click();
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objAnnualOtherIncome).sendKeys("10,000");
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objLivingexpences).clear();
    	driver.findElement(HomePages.objLivingexpences).click();
    	driver.findElement(HomePages.objLivingexpences).sendKeys("500");
    	
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objHomeLoan).clear();
    	driver.findElement(HomePages.objHomeLoan).click();
    	driver.findElement(HomePages.objHomeLoan).sendKeys("0");
    	
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objOtherLoan).clear();
    	driver.findElement(HomePages.objOtherLoan).click();
    	driver.findElement(HomePages.objOtherLoan).sendKeys("100");
    	
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
    	js1.executeScript("window.scrollBy(0,350)", "");
    	
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objMonthlyCmtmnt).clear();
    	driver.findElement(HomePages.objMonthlyCmtmnt).click();
    	driver.findElement(HomePages.objMonthlyCmtmnt).sendKeys("0");
    	
    	Thread.sleep(5000);
    	driver.findElement(HomePages.objCreditLimit).clear();
    	driver.findElement(HomePages.objCreditLimit).click();
    	driver.findElement(HomePages.objCreditLimit).sendKeys("10,000");
    	Thread.sleep(5000);
    	
    	driver.findElement(HomePages.objStartOverBtn).click();
    	
    	Thread.sleep(5000);
    	
    	driver.findElement(HomePages.objLivingexpences).clear();
    	driver.findElement(HomePages.objLivingexpences).click();
    	driver.findElement(HomePages.objLivingexpences).sendKeys("1");
    	Thread.sleep(5000);
    	
    	driver.findElement(HomePages.objworkOut).click();
    	
    	Thread.sleep(3000);
    	             
    	String msg = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
    	WebElement errorMessage = driver.findElement(HomePages.objerrorMsg);
    	String text = errorMessage.getText();
    	Assert.assertEquals(text, msg);
    	System.out.println("The message is verified successfully");
    	
    	
    	//driver.quit();
    	
    }

	}
