package Pages;
import org.openqa.selenium.By;

public class HomePages {
	
	
	
	public static By objSingle = By.id("application_type_single");
	
	public static By objNoOfDepen = By.xpath("//select[@title='Number of dependants']");
	
	public static By objHometoLivein =  By.xpath("//label[@for='borrow_type_home']");
	
	public static By objAnnualIncome = By.xpath("//input[@aria-labelledby='q2q1']");
	
    public static By objAnnualOtherIncome = By.xpath("//input[@aria-labelledby='q2q2']");
    
    public static By objLivingexpences = By.id("expenses");
    
    public static By objHomeLoan = By.id("homeloans");
    
    public static By objOtherLoan = By.id("otherloans");
    
    public static By objMonthlyCmtmnt = By.xpath("(//input[@value='0'])[8]");
    
    public static By objCreditLimit = By.xpath("(//input[@id='credit'])[1]");
    
    public static By objStartOverBtn = By.xpath("//button[@class='start-over']");
    
    public static By objworkOut = By.id("btnBorrowCalculater");
    
//    public static String msg = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
	
    public static By objerrorMsg = By.xpath("//div[@class='borrow__error__text']");
	  


}
