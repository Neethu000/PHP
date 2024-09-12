import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PHPResidential {

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
		driver.findElement(By.id("email")).sendKeys("allampriyanka94@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Real.123");
		driver.findElement(By.cssSelector("[class='btn btn-primary btn-block']")).click();
		
		//Mouse over action method
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Investment Analysis"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Residential"))).click().perform();
		
		
		
		//----------------------------------*Property Details*------------------------------------------//
		//Assert name
		driver.findElement(By.id("asset_name")).sendKeys("Priya Apartments");
		//purchase price
		driver.findElement(By.id("original_purchase_price")).sendKeys("750,000");
		//year acquired 
		WebElement year = driver.findElement(By.id("acquired_on"));
		year.clear();
		year.sendKeys("2020");
		//holding period
		WebElement period= driver.findElement(By.id("no_years"));
		period.clear();
		period.sendKeys("30");
		//Total SFT
		driver.findElement(By.id("total_sft")).sendKeys("14,000");
		//no.of units
		WebElement units = driver.findElement(By.id("no_units"));
		Select unitsdrop = new Select(units);
		unitsdrop.selectByVisibleText("20");
		//Assert appraisal
		WebElement asset= driver.findElement(By.id("asset_appraisal_value"));
		asset.clear();
		asset.sendKeys("7");
		//sales expense
		WebElement sales = driver.findElement(By.id("sales_expense_value"));
		sales.clear();
		sales.sendKeys("3");
		//Ammortization years
		WebElement amortization = driver.findElement(By.id("ammortization_years"));
		Select amortizationdrop= new Select(amortization);
		amortizationdrop.selectByVisibleText("30");
		//Annual rate interest
		driver.findElement(By.id("annual_rate_interests")).sendKeys("4.25");
		
		//-----------------------------------------*Loan Details*----------------------------------------------------//
		//Loan Details dropdown clicking
		driver.findElement(By.id("loan-details")).click();
		//down payment: percentage dropdown selecting fixed (percetage is displaying default)
//        WebElement downpay =driver.findElement(By.id("amount_down_payment_type"));
//        Select dp1 = new Select(downpay);
//        dp1.selectByVisibleText("Fixed");
        //down payment percentage entering
        WebElement dp2 = driver.findElement(By.id("amount_down_payment_value"));
        dp2.clear();
        dp2.sendKeys("20");
        
        //------------------------------------------*Closing Details*------------------------------------------
        //Closing Details dropdown clicking
        driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[3]")).click();
        //Closing Concession//
        WebElement CC = driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[1]"));
      	CC.clear();
        CC.sendKeys("Repairs");
      	//Closing Concession Amount
      	WebElement CCAmount =driver.findElement(By.id("closing_consessionamount"));
      	CCAmount.clear();
      	CCAmount.sendKeys("15,000");
      	
        //Closing Expenses//
      	WebElement CE =driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[2]"));
      	CE.clear();
      	CE.sendKeys("Legal Fees");
      	//Closing Expenses Amount
      	WebElement CEAmount =driver.findElement(By.id("closing_expenseamount"));
      	CEAmount.clear();
      	CEAmount.sendKeys("11000");
      	
        //--------------------------------------------*Tenant Details*---------------------------------------
        //Tenant dropdown clicking
      	driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[4]")).click();
      	
        //Tenant name
      	WebElement Tname =driver.findElement(By.id("tenant_name"));
      	Tname.clear();
      	Tname.sendKeys("Harmony Estates LLC");
      		
      	//SFT
      	driver.findElement(By.id("sft_leased")).sendKeys("2,500");
      		
      	//Rate:Rate Per Sq Ft displaying default,selecting Fixed Per Month//
//        WebElement Trate=driver.findElement(By.id("lease_rate_type"));
//        Select fixedPerMonth = new Select(Trate);
//        fixedPerMonth.selectByVisibleText("Fixed Per Month");
      		
        //Lease rate
      	driver.findElement(By.id("lease_rate")).sendKeys("3");
      		
      	//Ecalation frequency: equal is displaying default,selecting random	
//        WebElement EF =driver.findElement(By.id("rent_frequency0"));
//        Select EFRandom = new Select(EF);
//        EFRandom.selectByVisibleText("Random");
      		
      	//Increment value: pecentage default,selecting fixed
//        WebElement IV =driver.findElement(By.id("rent_increases"));
//        Select TIValue = new Select(IV);
//        TIValue.selectByVisibleText("Fixed");
      		
      	//Increment value
      	WebElement Invalue =driver.findElement(By.xpath("(//input[@id='rent_increase_value'])[1]"));
      	Invalue.clear();
      	Invalue.sendKeys("5");
      		
      	//For every
      	WebElement TenantFor =driver.findElement(By.xpath("(//select[@id='rent_increases_for_every_year'])[1]"));
      	Select TForEvenry = new Select(TenantFor);
      	TForEvenry.selectByVisibleText("3 Year");
      		
      	//clicking + symbol for Tenant Extra field//
      	driver.findElement(By.id("add")).click();
      	
        //clicking * symbol for remove Tenant Extra field//
        //driver.findElement(By.xpath("(//button[@id='2'])[1]")).click();
      		
      	//Tenant name
      	driver.findElement(By.xpath("(//input[@id='tenant_name'])[2]")).sendKeys("Harmony Estates LLC1");
      		
        //SFT
      	driver.findElement(By.xpath("(//input[@id='sft_leased'])[2]")).sendKeys("3000");
      		
      	//Rate:Rate Per Sq Ft displaying default,selecting Fixed Per Month//	
//        WebElement Trate=driver.findElement(By.xpath("(//select[@id='lease_rate_type'])[2]"));
//        Select fixedPerMonth = new Select(Trate);
//        fixedPerMonth.selectByVisibleText("Fixed Per Month");
      	 driver.findElement(By.xpath("(//input[@id='lease_rate'])[2]")).sendKeys("5");
      		
      	//Ecalation frequency: equal is displaying default,selecting random//
//        WebElement EF =driver.findElement(By.id("rent_frequency1"));
//        Select EFRandom = new Select(EF);
//        EFRandom.selectByVisibleText("Random");
      		
      	//Increment value: pecentage default,selecting fixed
//        WebElement IV =driver.findElement(By.name("rent_increases[1]"));
//        Select IValue = new Select(IV);
//        IValue.selectByVisibleText("Fixed");
      		
      	//Increment value
      	WebElement Invalue1 =driver.findElement(By.xpath("(//input[@id='rent_increase_value'])[2]"));
      	Invalue1.clear();
      	Invalue1.sendKeys("3");
      		
      	//For every
      	WebElement TenantFor1 =driver.findElement(By.xpath("(//select[@id='rent_increases_for_every_year'])[2]"));
      	Select ForEvenry1 = new Select(TenantFor1);
      	ForEvenry1.selectByVisibleText("5 Year");
      	
        //-----------------------------------*Additional Income Details*-----------------------------------------
      	//Additional Income Details dropdown clicking
      	driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[5]")).click();
      		
        //Income name
      	driver.findElement(By.xpath("(//input[@id='income_name'])[1]")).sendKeys("Parking Fees");
      	//Income amount
      	driver.findElement(By.xpath("(//input[@id='income_amount'])[1]")).sendKeys("400");
      		
      	//Ecalation frequency: equal is displaying default,selecting random
//         WebElement EF =driver.findElement(By.id("income_frequency0"));
//         Select EFRandom = new Select(EF);
//         EFRandom.selectByVisibleText("Random");
      		
      	//Increment value: pecentage default,selecting fixed
      	  WebElement IV =driver.findElement(By.id("income_increases_type"));
      	  Select IValue = new Select(IV);
      	  IValue.selectByVisibleText("Fixed");
      		
      	//Increment value
      		WebElement Invalue2 =driver.findElement(By.id("income_increases_for_every_year"));
      		Invalue2.clear();
      		Invalue2.sendKeys("50");
      		
      	//For every
      		WebElement AddIncomeFor1 =driver.findElement(By.name("income_increases_for_every_year[0][]"));
      		Select ForEvenry2 = new Select(AddIncomeFor1);
      		ForEvenry2.selectByVisibleText("2 Year");
      	//-------------------------------------------*Expenses Details*-------------------------------------------------//
    	//Expenses details dropdown clicking
      		driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[6]")).click();
      		
      	//-----------------------Taxes dropdown clicking--------------------------//
      		
    		//taxes:displaying default yearly > selecting monthly
//    		WebElement taxe = driver.findElement(By.id("taxes_ye_mo"));
//    		Select year1= new Select(taxe);
//    		year1.selectByVisibleText("Monthly");
    				
    		WebElement exptaxe =driver.findElement(By.id("expense_taxes"));
    		exptaxe.clear();
    		exptaxe.sendKeys("8000");
    				
    		//Ecalation frequency: equal is displaying default,selecting random		
//    		WebElement TaxeEF =driver.findElement(By.id("taxes_frequency"));
//    		Select TaxeEFRandom = new Select(TaxeEF);
//    		TaxeEFRandom.selectByVisibleText("Random");
    				
    		//Increment value: pecentage default,selecting fixed		
//    		WebElement TaxeIV =driver.findElement(By.id("taxes_increases_type"));
//    		Select TaxeIValue = new Select(TaxeIV);
//    		TaxeIValue.selectByVisibleText("Fixed");
    				
    		//Increment value
    		WebElement TaxeInvalue =driver.findElement(By.id("taxes_increase_value"));
    		TaxeInvalue.clear();
    		TaxeInvalue.sendKeys("3");
    				
    		//For every
    		WebElement Taxefor =driver.findElement(By.id("taxes_increases_for_every_year"));
    		Select TaxeForEvery = new Select(Taxefor);
    		TaxeForEvery.selectByVisibleText("5 Year");
    		
    		//-----------------------------Insurance dropdown clicking----------------------------------//
    		
    		driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[7]")).click();
    				
    		//Insurance:displaying default yearly > selecting monthly
//    		WebElement Insurance = driver.findElement(By.id("insu_ye_mo"));
//    		Select year2= new Select(Insurance);
//    		year2.selectByVisibleText("Monthly");
    				
    		WebElement expInsur =driver.findElement(By.id("insurance_expense"));
    		expInsur.clear();
    		expInsur.sendKeys("2500");
    				
    		//Ecalation frequency: equal is displaying default,selecting random		
//    		WebElement InsurEF =driver.findElement(By.id("insu_frequency"));
//    		Select InsurEFRandom = new Select(InsurEF);
//    		InsurEFRandom.selectByVisibleText("Random");
    				
    		//Increment value: pecentage default,selecting fixed		
    		WebElement InsurIV =driver.findElement(By.id("insu_increases_type"));
    		Select InsurIValue = new Select(InsurIV);
    		InsurIValue.selectByVisibleText("Fixed");
    				
    		//Increment value
    		WebElement InsurInvalue =driver.findElement(By.id("insu_increase_value"));
    		InsurInvalue.clear();
    		InsurInvalue.sendKeys("100");
    				
    		//For every
    		WebElement Insurfor =driver.findElement(By.id("insu_increases_for_every_year"));
    	    Select InsurForEvery = new Select(Insurfor);
    		InsurForEvery.selectByVisibleText("2 Year");
    		
    		//-------------------------HOA dropdown clicking-----------------------------//
    		
    		driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[8]")).click();
    								
    		//HOA:displaying default yearly > selecting monthly
    		WebElement HOA = driver.findElement(By.id("hoa_ye_mo"));
    		Select year5= new Select(HOA);
    		year5.selectByVisibleText("Monthly");
    								
    		WebElement exphoa =driver.findElement(By.id("expense_hoa"));
    		exphoa.clear();
    		exphoa.sendKeys("200");
    						
    		//Ecalation frequency: equal is displaying default,selecting random		
    		WebElement HOAEF =driver.findElement(By.id("hoa_frequency"));
    		Select HOAEFRandom = new Select(HOAEF);
    		HOAEFRandom.selectByVisibleText("Random");
    					
    		//Increment value: pecentage default,selecting fixed		
//    		WebElement HOAIV =driver.findElement(By.id("hoa_increases_type"));
//    		Select HOAIValue = new Select(HOAIV);
//    		HOAIValue.selectByVisibleText("Fixed");
    						
    		//Increment value
    		WebElement HOAInvalue =driver.findElement(By.id("hoa_increase_value"));
    		HOAInvalue.clear();
    		HOAInvalue.sendKeys("2");
    										
    		//For every
    		WebElement HOAfor =driver.findElement(By.id("hoa_increases_for_every_year"));
    		Select HOAForEvery = new Select(HOAfor);
    		HOAForEvery.selectByVisibleText("4 Year");
    		
    		//-------------------------Other Expenses dropdown clicking-----------------------------//
    		
    		driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[9]")).click();
    		
    		//MAINTENANCE TYPE EXPENSE: pecentage default,selecting fixed	
    	 	
//    		WebElement MAINTENANCE =driver.findElement(By.id("expense_maintenance_type"));
//    		Select Type = new Select(MAINTENANCE);
//    		Type.selectByVisibleText("Fixed");

    		WebElement Maintevalue =driver.findElement(By.id("expense_maintenance"));
    		Maintevalue.clear();
    		Maintevalue.sendKeys("2.5");
    		
    		//VACANCY:pecentage default,selecting fixed	
    		
//    		WebElement VACANCY =driver.findElement(By.id("expense_vacancy_type"));
//    		Select Vcan = new Select(VACANCY);
//    		Vcan.selectByVisibleText("Fixed");

    		WebElement Vacancyvalue =driver.findElement(By.id("expense_vacancy"));
    		Vacancyvalue.clear();
    		Vacancyvalue.sendKeys("3");
    		
    		//PROPERTY MANAGEMENT EXPENSE:pecentage default,selecting fixed	
    		
    		WebElement PROPERTY =driver.findElement(By.id("property_mgmt_type"));
    		Select PropertyManage = new Select(PROPERTY);
    		PropertyManage.selectByVisibleText("Fixed");

    		WebElement PropertyValue =driver.findElement(By.id("property_mgmt"));
    		PropertyValue.clear();
    		PropertyValue.sendKeys("500");
    		
    		//-----------------------------------*Additional Expenses Details*--------------------------------------//
    		//Additional Expenses Details dropdown clicking
    		driver.findElement(By.xpath("(//button[@class='btn btn-link text-white shadow-none collapsed'])[10]")).click();
            
    		//Expense Name
    		driver.findElement(By.id("expense_head_name")).sendKeys("Landscaping Services");
    		//Expense Amount
    		driver.findElement(By.id("expense_amount")).sendKeys("250");
    				
    		//Ecalation frequency: equal is displaying default,selecting random		
    		WebElement AddExpEF =driver.findElement(By.id("expense_frequency0"));
    		Select AddExpEFRandom = new Select(AddExpEF);
    		AddExpEFRandom.selectByVisibleText("Random");
    													
    		//Increment value: pecentage default,selecting fixed		
//    		WebElement AddExpIV =driver.findElement(By.id("expense_increases_type"));
//    		Select AddExpIValue = new Select(AddExpIV);
//    		AddExpIValue.selectByVisibleText("Fixed");
    												
    		//Increment value
    		WebElement AddExpInvalue =driver.findElement(By.id("expense_increase_value"));
    		AddExpInvalue.clear();
    		AddExpInvalue.sendKeys("2");
    																
    		//For every
    		WebElement AddExpfor =driver.findElement(By.id("expense_increases_for_every_year"));
    		Select AddExpForEvery = new Select(AddExpfor);
    		AddExpForEvery.selectByVisibleText("3 Year");
    		
    		//clicking on Save Investment Analysis botton
    		driver.findElement(By.id("alert-warning")).click();
    		//In alert box clicking on save analysis button
    		driver.findElement(By.xpath("//button[text()='Save Investment Analysis']")).click();
    		//get the displaying success text
    		String SuccessText =driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']")).getText();
    		//Print the success text
    		System.out.println(SuccessText);
        
        
	}

}
