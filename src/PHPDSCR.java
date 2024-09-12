import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PHPDSCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
		driver.get("http://dev.roi.realreturns.ai/");
		
		// Assuming driver is your WebDriver instance
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down vertically by 250 pixels
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.linkText("LOGIN")).click();
		//SignIn
		driver.findElement(By.id("email")).sendKeys("bharathich1312@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Real.123");
		driver.findElement(By.cssSelector("[class='btn btn-primary btn-block']")).click();
		
		//Mouse over action method
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Investment Analysis"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Commercial"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("DSCR"))).click().perform();
		
		try {
			//get the displaying Limit over text 
        String limitOverText = driver.findElement(By.cssSelector("[class='alert alert-warning alert-dismissible']")).getText();
			//print the limit over text
        System.out.println(limitOverText);
			
        } catch (NoSuchElementException e) {
	
		
		//---------------------------------------Property Details---------------------------------------------------//
		//ASSET NAME
		driver.findElement(By.id("borrower_name")).sendKeys("Oakwood Apartments");
		//PROPERTY TYPE 
		WebElement property = driver.findElement(By.id("property_type"));
		Select Property1 = new Select(property);
		Property1.selectByVisibleText("Mixed-Use");
		//No Of Units
		WebElement units = driver.findElement(By.id("no_units"));
		Select units1 = new Select(units);
		units1.selectByVisibleText("30");
		//APPROX SQ FOOTAGE
		driver.findElement(By.id("approximate_sq_footage")).sendKeys("60,000");
		
		//-------------------------------------------Loan Terms-----------------------------------------------------//
		//Loan terms dropdown clicking
		driver.findElement(By.cssSelector("[aria-controls='collapse-2']")).click();
		//PROPERTY VALUE
		driver.findElement(By.id("property_value")).sendKeys("6,000,000");
		//AMORTIZATION (YEARS)
		WebElement Year = driver.findElement(By.id("amortization_years"));
		Select YearDrop = new Select(Year);
		YearDrop.selectByVisibleText("30");
		//Intrest rate
		WebElement rate = driver.findElement(By.id("interest_rate"));
		rate.clear();
		rate.sendKeys("4.5");
		
		//----------------------------------------------Income---------------------------------------------------------//
		//Income dropdown clicking
		driver.findElement(By.cssSelector("[aria-controls='collapse-3']")).click();
		//GROSS ANNUAL RENTAL INC
		driver.findElement(By.id("gross_annual_rental")).sendKeys("720,000");
		//OTHER INCOME
		WebElement income =driver.findElement(By.id("other_income"));
		income.clear();
		income.sendKeys("25,000");
		
		//--------------------------------------------Annual Operating Expenses--------------------------------------//
        //AOExp dropdown clicking 
		driver.findElement(By.cssSelector("[aria-controls='collapse-4']")).click();
		//UTILITIES / TELEPHONE
		WebElement  Utility =driver.findElement(By.id("utilities_telephone"));
		Utility.clear();
		Utility.sendKeys("20,000");
		//REPAIRS AND MAINTENANCE
		WebElement repairs=  driver.findElement(By.id("repairs_maintenance"));
		repairs.clear();
		repairs.sendKeys("30,000");
		//SALARIES / LEGAL / ADMIN
		WebElement salaries=  driver.findElement(By.id("salaries_legal"));
		salaries.clear();
		salaries.sendKeys("40,000");
		//SNOW / TRASH
		WebElement snow=  driver.findElement(By.id("snow_trash"));
		snow.clear();
		snow.sendKeys("10,000"); 
		//R.E. TAXES
		WebElement taxes=  driver.findElement(By.id("re_taxes"));
		taxes.clear();
		taxes.sendKeys("30,000");
		//INSURANCE
		WebElement insurance=  driver.findElement(By.id("insurance"));
		insurance.clear();
		insurance.sendKeys("35,000");
		//OTHER OPERATING EXP
		WebElement other=  driver.findElement(By.id("other_operating_exp"));
		other.clear();
		other.sendKeys("15,000");
		//ANNUAL OPERATING EXP
		WebElement annual=  driver.findElement(By.id("annual_operating_exp"));
		annual.clear();
		annual.sendKeys("170,000");
		//MGMT FEES
		WebElement mgmt=  driver.findElement(By.id("mgmt_fees"));
		mgmt.clear();
		mgmt.sendKeys("35,000");
		
		//click on save analysis button
	    driver.findElement(By.id("alert-warning")).click();
	    //alert box appears > clicking on save investment analysis 
		driver.findElement(By.cssSelector("[class='btn btn-success']")).click();
		//Print the success text
		String SuccessText =driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']")).getText(); 
		System.out.println(SuccessText);
		
        }
	}

}
