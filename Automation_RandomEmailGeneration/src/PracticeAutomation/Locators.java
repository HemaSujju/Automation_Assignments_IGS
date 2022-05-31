package PracticeAutomation;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/Users/Hema/Downloads/chromedriver_win32/chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();

			driver.get("http://practice.automationtesting.in");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.partialLinkText("My Account")).click();
			Thread.sleep(5000);
			

			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("username" + randomInt + "@gmail.com");
//			driver.findElement(By.id("reg_email")).sendKeys("Hema$%$%%$%$%%$%$@gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='reg_password']")).sendKeys("*&^%$Hema12345HGYTRB$#%^");
            Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@class='woocommerce-Button button'])[2]")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Addresses")).click();
			driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/edit-address/billing']")).click();
			driver.findElement(By.id("billing_first_name")).sendKeys("Hema");
			driver.findElement(By.id("billing_last_name")).sendKeys("C");
			driver.findElement(By.id("billing_company")).sendKeys("IGS");
			driver.findElement(By.id("billing_phone")).sendKeys("9902810147");
			driver.findElement(By.id("billing_address_1")).sendKeys("Kumaraswamy Layout");
			driver.findElement(By.id("billing_address_2")).sendKeys("#705,PRAYOG");
			driver.findElement(By.id("billing_city")).sendKeys("Bengaluru");
			driver.findElement(By.id("billing_postcode")).sendKeys("560078");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			driver.findElement(By.id("s2id_billing_state")).click();
			
			WebElement dropdown=driver.findElement(By.id("s2id_autogen2_search"));
		      dropdown.sendKeys("Karnataka");
		      dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='save_address']")).click();
			driver.findElement(By.linkText("Addresses")).click();
			//Shipping Address

			driver.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/my-account/edit-address/shipping']")).click();
			driver.findElement(By.id("shipping_first_name")).sendKeys("Hema");
			driver.findElement(By.id("shipping_last_name")).sendKeys("C");
			driver.findElement(By.id("shipping_company")).sendKeys("IGS");
			//driver.findElement(By.id("shipping_address_1")).sendKeys("9902810147");
			driver.findElement(By.id("shipping_address_1")).sendKeys("Kumaraswamy Layout");
			driver.findElement(By.id("shipping_address_2")).sendKeys("#705,PRAYOG");
			driver.findElement(By.id("shipping_city")).sendKeys("Bengaluru");
			driver.findElement(By.id("shipping_postcode")).sendKeys("560078");
			JavascriptExecutor js1 = (JavascriptExecutor) driver;//this is for scroll down
			js1.executeScript("window.scrollBy(0,350)", "");//this for scroll down
			driver.findElement(By.id("s2id_shipping_state")).click();
			WebElement drop2=driver.findElement(By.id("s2id_autogen2_search"));
			drop2.sendKeys("Karnataka");
			drop2.sendKeys(Keys.ENTER);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='save_address']")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.quit();
	        System.out.println("browser is closed");
			
	
	}

}
