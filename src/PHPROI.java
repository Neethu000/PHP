import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PHPROI {

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
		a.moveToElement(driver.findElement(By.linkText("ROI"))).click().perform();
		
		//-------------------------Property Details----------------------------------//
		//Assert name
	    driver.findElement(By.id("asset_name")).sendKeys("Lakeview Apartments");
	    //PURCHASE PRICE
	    driver.findElement(By.cssSelector("[placeholder='Purchase Price']")).sendKeys("2,500,000");
	    //YEAR ACQUIRED
	    WebElement year= driver.findElement(By.id("acquired_on"));
	    year.clear();
	    year.sendKeys("2019");
	    //HOLDING PERIOD
	    WebElement HOLDING= driver.findElement(By.id("no_years"));
	    HOLDING.clear();
	    HOLDING.sendKeys("30");
	    //TOTAL SFT
	    driver.findElement(By.id("total_sft")).sendKeys("70,000");
	    //NO. OF UNITS
	    WebElement units = driver.findElement(By.id("no_units"));
	    Select noofunits = new Select(units);
	    noofunits.selectByVisibleText("25");
	    //ASSET APPRAISAL VALUE:percentage dropdown> selecting fixed (percetage is displaying default)
//	    WebElement assetdrop = driver.findElement(By.id("asset_appraisal_type"));
//	    Select assertvalue = new Select(assetdrop);
//	    assertvalue.selectByVisibleText("Fixed");
	    WebElement asset = driver.findElement(By.id("asset_appraisal_value"));
	    asset.clear();
	    asset.sendKeys("7");
	    //SALES EXPENSES:percentage dropdown> selecting fixed (percetage is displaying default)
//	    WebElement salesdrop = driver.findElement(By.id("sales_expense_type"));
//	    Select salesexp = new Select(salesdrop);
//	    salesexp.selectByVisibleText("Fixed");
	    WebElement sales = driver.findElement(By.id("sales_expense_value"));
	    sales.clear();
	    sales.sendKeys("3.5");
	    //AMMORTIZATION YEARS
	    WebElement AMMORTIZATION = driver.findElement(By.id("ammortization_years"));
	    Select Ammort = new Select(AMMORTIZATION);
	    Ammort.selectByVisibleText("25");
	    //ANNUAL RATE OF INTEREST
	    driver.findElement(By.id("annual_rate_interests")).sendKeys("4.5");
	    //DEBT SERVICE RATIO
	    WebElement debt= driver.findElement(By.id("debt_service_ratio"));
	    debt.clear();
	    debt.sendKeys("1.2");
	    //AVG EXPENSES 
	    WebElement avg = driver.findElement(By.id("avg_exp"));
	    avg.clear();
	    avg.sendKeys("25,000");
	    //VACANCY:percentage dropdown> selecting fixed (percetage is displaying default)
//	    WebElement vacancy = driver.findElement(By.id("expense_vacancy_type"));
//	    Select vacan = new Select(vacancy);
//	    vacan.selectByVisibleText("Fixed");
	    WebElement vacancy1 = driver.findElement(By.id("expense_vacancy"));
	    vacancy1.clear();
	    vacancy1.sendKeys("5");
	    
	    //-------------------------Loan Details----------------------------------//
	    //Loan Details dropdown clicking
	    driver.findElement(By.id("loan-details")).click();
	    //down payment: percentage dropdown selecting fixed (percetage is displaying default)
//        WebElement downpay =driver.findElement(By.id("amount_down_payment_type"));
//        Select dp = new Select(downpay);
//        dp.selectByVisibleText("Fixed");
        //down payment percentage entering
        WebElement dp1 = driver.findElement(By.id("amount_down_payment_value"));
        dp1.clear();
        dp1.sendKeys("20");
	    
        //------------------------------------------*Closing Details*------------------------------------------//
        //Closing Details dropdown clicking
        driver.findElement(By.cssSelector("[aria-controls='collapse-3']")).click();
      //Closing Concession//
      	WebElement CC = driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[1]"));
      	CC.clear();
      	CC.sendKeys("Repairs");
      	//Closing Concession Amount
      	WebElement CCAmount =driver.findElement(By.id("closing_consessionamount"));
      	CCAmount.clear();
      	CCAmount.sendKeys("10,000");
      	//Closing Concession + symbol clicking
      	driver.findElement(By.id("add4")).click();
      	//Closing Concession entering extra fields
      	driver.findElement(By.xpath("//input[@class='form-control weight_list']")).sendKeys("Repairs1");
      	driver.findElement(By.xpath("//input[@placeholder='Enter amount']")).sendKeys("10000");
      	//Closing Concession * symbol clicking
      	//driver.findElement(By.xpath("//button[@id='2']")).click();
      		
      	//Closing Expenses//
      	WebElement CE =driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[2]"));
      	CE.clear();
      	CE.sendKeys("Legal Fees");
      	//Closing Expenses Amount
      	WebElement CEAmount =driver.findElement(By.id("closing_expenseamount"));
      	CEAmount.clear();
      	CEAmount.sendKeys("15000");
      	//Closing Expenses + symbol clicking
      	driver.findElement(By.id("add3")).click();
      	//Closing Expenses entering extra fields
      	driver.findElement(By.xpath("(//input[@class='form-control weight_list'])[2]")).sendKeys("Legal Fees1");
      	driver.findElement(By.xpath("(//input[@placeholder='Enter amount'])[2]")).sendKeys("15000");
      	//Closing Expenses * symbol clicking
      	//driver.findElement(By.xpath("//button[@id='3']")).click();
              
        //------------------------------------------*Tenant Details*------------------------------------------//
        //Tenant dropdown clicking
	    driver.findElement(By.xpath("//button[normalize-space()='Tenant Details']")).click();
	    //Tenant name
	    WebElement Tname =driver.findElement(By.id("tenant_name"));
	  	Tname.clear();
	  	Tname.sendKeys("Innovate Corp.");
	  				
	  	//SFT
	  	driver.findElement(By.id("sft_leased")).sendKeys("15,000");
	  				
	    //Rate:Rate Per Sq Ft displaying default,selecting Fixed Per Month//
	  	    
//	  	WebElement Trate=driver.findElement(By.id("lease_rate_type"));
//	  	Select fixedPerMonth = new Select(Trate);
//	  	fixedPerMonth.selectByVisibleText("Fixed Per Month");
	  		
	  	//Lease rate
	  	driver.findElement(By.id("lease_rate")).sendKeys("3");
	  				
	  	//Ecalation frequency: equal is displaying default,selecting random
	  				
//	  	WebElement EF =driver.findElement(By.id("rent_frequency0"));
//	  	Select EFRandom = new Select(EF);
//	  	EFRandom.selectByVisibleText("Random");
	  				
	  	//Increment value: pecentage default,selecting fixed
	  				
//	  	WebElement IV =driver.findElement(By.id("rent_increases"));
//	  	Select TIValue = new Select(IV);
//	  	TIValue.selectByVisibleText("Fixed");
	  				
	  	//Increment value
	  	WebElement Invalue =driver.findElement(By.id("rent_increase_value"));
	  	Invalue.clear();
	  	Invalue.sendKeys("3.5");
	  		
	  	//For every
	  	WebElement TenantFor =driver.findElement(By.id("rent_increases_for_every_year"));
	  	Select TForEvenry = new Select(TenantFor);
	  	TForEvenry.selectByVisibleText("2 Year");
	  				
	  	//clicking + symbol for Tenant Extra field//
	  	driver.findElement(By.id("add")).click();
	  		
	  	//clicking * symbol for remove Tenant Extra field//
	  	//driver.findElement(By.xpath("(//button[@id='2'])[1]")).click();

	  	//ExtraTenant name
	  	driver.findElement(By.xpath("(//input[@id='tenant_name'])[2]")).sendKeys("Harmony Estates LLC1");
	  		
	  	//SFT
	  	driver.findElement(By.xpath("(//input[@id='sft_leased'])[2]")).sendKeys("3000");
	  		
	  	//Rate:Rate Per Sq Ft displaying default,selecting Fixed Per Month//
	  		
//	  	WebElement Trate1=driver.findElement(By.xpath("(//select[@id='lease_rate_type'])[2]"));
//	  	Select fixedPerMonth1 = new Select(Trate1);
//	  	fixedPerMonth1.selectByVisibleText("Fixed Per Month");
	  	
	  	//lease rate
	  	driver.findElement(By.xpath("(//input[@id='lease_rate'])[2]")).sendKeys("5");
	  		
	  	//Ecalation frequency: equal is displaying default,selecting random//
	  		
//	  	WebElement EF1 =driver.findElement(By.id("rent_frequency1"));
//	  	Select EFRandom1 = new Select(EF1);
//	  	EFRandom1.selectByVisibleText("Random");
	  		
	  	//Increment value: pecentage default,selecting fixed
	  		
//	  	WebElement IV1 =driver.findElement(By.name("rent_increases[1][]"));
//	  	Select IValue = new Select(IV1);
//	  	IValue.selectByVisibleText("Fixed");
	  		
	  	//Increment value
	  	WebElement Invalue1 =driver.findElement(By.name("rent_increase_value[1][]"));
	  	Invalue1.clear();
	  	Invalue1.sendKeys("3");
	  		
	  	//For every
	  	WebElement TenantFor1 =driver.findElement(By.name("rent_increases_for_every_year[1][]"));
	  	Select ForEvery1 = new Select(TenantFor1);
	  	ForEvery1.selectByVisibleText("5 Year");
	  	
	    //-----------------------------------*Reimbursement Details*----------------------------------------//
	    //Reimbursement Details dropdown clicking
	    driver.findElement(By.xpath("//button[normalize-space()='Reimbursement Details']")).click();
	    //REIMBURSEMENT	
	  	WebElement Reimbursement1 = driver.findElement(By.id("reim_ye_mo"));
	  	Select reimburs = new Select(Reimbursement1);
	  	reimburs.selectByVisibleText("Monthly");
	  	WebElement RIncome =driver.findElement(By.id("reimbursement_income"));
	  	RIncome.clear();
	  	RIncome.sendKeys("2,500");
	  		
	  	//ESCALATION FREQUENCY:equal is displaying default,selecting random
	  		
	  	WebElement EFrequency =driver.findElement(By.id("reim_frequency"));
	  	Select EscalationFreq = new Select(EFrequency);
	  	EscalationFreq.selectByVisibleText("Random");
	  		
	  	//INCREAMENT VALUE:pecentage default,selecting fixed
	  		
//	  	WebElement IValue =driver.findElement(By.id("reim_increases_type"));
//	  	Select IncreValue1 = new Select(IValue);
//	  	IncreValue1.selectByVisibleText("Fixed");
	  		
	  	//Increment value
	  	WebElement Invalue2 =driver.findElement(By.id("reim_increase_value"));
	  	Invalue2.clear();
	  	Invalue2.sendKeys("4");
	  				
	  	//For every
	  	WebElement ReimbursFor =driver.findElement(By.id("reim_increases_for_every_year"));
	  	Select ForEvery2 = new Select(ReimbursFor);
	  	ForEvery2.selectByVisibleText("2 Year");
	  	
	    //-----------------------------------*Additional Income Details*----------------------------------------//
	    //Additional Income Details dropdown clicking
	  	driver.findElement(By.xpath("//button[normalize-space()='Additional Income Details']")).click();
	    //Income name
	  	driver.findElement(By.xpath("(//input[@id='income_name'])[1]")).sendKeys("Parking Fees");
	  	//Income amount
	  	driver.findElement(By.xpath("(//input[@id='income_amount'])[1]")).sendKeys("400");
	  				
	  	//Ecalation frequency: equal is displaying default,selecting random		
//	  	WebElement EF1 =driver.findElement(By.id("income_frequency0"));
//	  	Select EFRandom1 = new Select(EF1);
//	  	EFRandom1.selectByVisibleText("Random");
	  				
	  	//Increment value: pecentage default,selecting fixed		
//	  	WebElement IV1 =driver.findElement(By.name("income_increases_type[0][]"));
//	  	Select IValue1 = new Select(IV1);
//	  	IValue1.selectByVisibleText("Fixed");
	  		
	  	//Increment value
	  	WebElement Invalue3 =driver.findElement(By.name("income_increase_value[0][]"));
	  	Invalue3.clear();
	  	Invalue3.sendKeys("50");
	  		
	  	//For every
	  	WebElement AddIncomeFor1 =driver.findElement(By.name("income_increases_for_every_year[0][]"));
	  	Select ForEvery3 = new Select(AddIncomeFor1);
	  	ForEvery3.selectByVisibleText("2 Year");
	  	
	    //-----------------------------------*Expenses Details*----------------------------------------//				
	  	//Expenses details dropdown clicking
	  	driver.findElement(By.xpath("//button[normalize-space()='Expenses DETAILS']")).click();
	  	
		//-----------------------Taxes--------------------------//
	    //taxes:displaying default yearly > selecting monthly
//		WebElement taxe = driver.findElement(By.id("taxes_ye_mo"));
//		Select year1= new Select(taxe);
//		year1.selectByVisibleText("Monthly");
		
		WebElement exptaxe =driver.findElement(By.id("expense_taxes"));
		exptaxe.clear();
		exptaxe.sendKeys("22,000");
		
		//Ecalation frequency: equal is displaying default,selecting random		
//		WebElement TaxeEF =driver.findElement(By.id("taxes_frequency"));
//		Select TaxeEFRandom = new Select(TaxeEF);
//		TaxeEFRandom.selectByVisibleText("Random");
		
		//Increment value: pecentage default,selecting fixed		
//		WebElement TaxeIV =driver.findElement(By.name("taxes_increases_type[]"));
//		Select TaxeIValue = new Select(TaxeIV);
//		TaxeIValue.selectByVisibleText("Fixed");
		
		//Increment value
		WebElement TaxeInvalue =driver.findElement(By.name("taxes_increase_value[]"));
		TaxeInvalue.clear();
		TaxeInvalue.sendKeys("3");
		
		//For every
		WebElement Taxefor =driver.findElement(By.name("taxes_increases_for_every_year[]"));
		Select TaxeForEvery = new Select(Taxefor);
		TaxeForEvery.selectByVisibleText("4 Year");
		
		//-----------------------------Insurance dropdown clicking----------------------------------//
		
		driver.findElement(By.xpath("//button[normalize-space()='Insurance']")).click();
				
		//Insurance:displaying default yearly > selecting monthly
		WebElement Insurance = driver.findElement(By.id("insu_ye_mo"));
		Select year2= new Select(Insurance);
		year2.selectByVisibleText("Monthly");
				
		WebElement expInsur =driver.findElement(By.id("insurance_expense"));
		expInsur.clear();
		expInsur.sendKeys("350");
				
		//Ecalation frequency: equal is displaying default,selecting random		
		WebElement InsurEF =driver.findElement(By.id("insu_frequency"));
		Select InsurEFRandom = new Select(InsurEF);
		InsurEFRandom.selectByVisibleText("Random");
				
		//Increment value: pecentage default,selecting fixed		
//		WebElement InsurIV =driver.findElement(By.name("insu_increases_type[]"));
//		Select InsurIValue = new Select(InsurIV);
//		InsurIValue.selectByVisibleText("Fixed");
				
		//Increment value
		WebElement InsurInvalue =driver.findElement(By.name("insu_increase_value[]"));
		InsurInvalue.clear();
		InsurInvalue.sendKeys("4");
				
		//For every
		WebElement Insurfor =driver.findElement(By.name("insu_increases_for_every_year[]"));
		Select InsurForEvery = new Select(Insurfor);
		InsurForEvery.selectByVisibleText("2 Year");
		
		//-------------------------------Common Area Maintenance dropdown clicking---------------------//
		
		driver.findElement(By.xpath("//button[normalize-space()='Common Area Maintenance']")).click();
				
		//CAM:displaying default yearly > selecting monthly
//		WebElement CAM = driver.findElement(By.id("cam_ye_mo"));
//		Select year3= new Select(CAM);
//		year3.selectByVisibleText("Monthly");
						
		WebElement expcam =driver.findElement(By.id("expense_cam"));
		expcam.clear();
		expcam.sendKeys("18,000");
						
		//Ecalation frequency: equal is displaying default,selecting random		
//		WebElement CamEF =driver.findElement(By.id("cam_frequency"));
//		Select CamEFRandom = new Select(CamEF);
//		CamEFRandom.selectByVisibleText("Random");
						
		//Increment value: pecentage default,selecting fixed		
		WebElement CamIV =driver.findElement(By.name("cam_increases_type[]"));
		Select CamIValue = new Select(CamIV);
		CamIValue.selectByVisibleText("Fixed");
						
		//Increment value
		WebElement CamInvalue =driver.findElement(By.name("cam_increase_value[]"));
		CamInvalue.clear();
		CamInvalue.sendKeys("600");
						
		//For every
		WebElement Camfor =driver.findElement(By.name("cam_increases_for_every_year[]"));
		Select CamForEvery = new Select(Camfor);
		CamForEvery.selectByVisibleText("3 Year");
				
		//---------------------UTILITIES dropdown clicking-------------------------//
				
		driver.findElement(By.xpath("//button[normalize-space()='Utilities']")).click();
						
		//Utilituies:displaying default yearly > selecting monthly
		WebElement Utility = driver.findElement(By.id("utilities_ye_mo"));
		Select year4= new Select(Utility);
		year4.selectByVisibleText("Monthly");
						
		WebElement exputility =driver.findElement(By.id("expense_utilities"));
		exputility.clear();
		exputility.sendKeys("500");
				
		//Ecalation frequency: equal is displaying default,selecting random		
		WebElement UtilityEF =driver.findElement(By.id("utilities_frequency"));
		Select UtilityEFRandom = new Select(UtilityEF);
		UtilityEFRandom.selectByVisibleText("Random");
					
		//Increment value: pecentage default,selecting fixed		
		WebElement UtilityIV =driver.findElement(By.name("utilities_increases_type[]"));
		Select UIValue = new Select(UtilityIV);
		UIValue.selectByVisibleText("Fixed");
				
		//Increment value
		WebElement UtilityInvalue =driver.findElement(By.name("utilities_increase_value[]"));
		UtilityInvalue.clear();
		UtilityInvalue.sendKeys("3.5");
								
		//For every
		WebElement Utilityfor =driver.findElement(By.name("utilities_increases_for_every_year[]"));
		Select UtilityForEvery = new Select(Utilityfor);
		UtilityForEvery.selectByVisibleText("2 Year");
				
		//-------------------------HOA dropdown clicking-----------------------------//
				
		driver.findElement(By.xpath("//button[normalize-space()='HOA']")).click();
								
		//HOA:displaying default yearly > selecting monthly
//		WebElement HOA = driver.findElement(By.id("hoa_ye_mo"));
//		Select year5= new Select(HOA);
//		year5.selectByVisibleText("Monthly");
								
		WebElement exphoa =driver.findElement(By.id("expense_hoa"));
		exphoa.clear();
		exphoa.sendKeys("2500");
						
		//Ecalation frequency: equal is displaying default,selecting random		
//		WebElement HOAEF =driver.findElement(By.id("hoa_frequency"));
//		Select HOAEFRandom = new Select(HOAEF);
//		HOAEFRandom.selectByVisibleText("Random");
							
		//Increment value: pecentage default,selecting fixed		
		WebElement HOAIV =driver.findElement(By.name("hoa_increases_type[]"));
		Select HOAIValue = new Select(HOAIV);
		HOAIValue.selectByVisibleText("Fixed");
						
		//Increment value
		WebElement HOAInvalue =driver.findElement(By.name("hoa_increase_value[]"));
		HOAInvalue.clear();
		HOAInvalue.sendKeys("100");
										
		//For every
		WebElement HOAfor =driver.findElement(By.name("hoa_increases_for_every_year[]"));
		Select HOAForEvery = new Select(HOAfor);
		HOAForEvery.selectByVisibleText("2 Year");
				
		//-----------------------------MANAGEMENT FEE dropdown clicking------------------------------//
				
		driver.findElement(By.xpath("//button[normalize-space()='Management Fee']")).click();
										
		//MANAGEMENT FEE:displaying default yearly > selecting monthly
		WebElement MangFEE = driver.findElement(By.id("management_ye_mo"));
		Select year6= new Select(MangFEE);
		year6.selectByVisibleText("Monthly");
										
		WebElement expfee =driver.findElement(By.id("expense_management"));
		expfee.clear();
		expfee.sendKeys("2000");
								
		//Ecalation frequency: equal is displaying default,selecting random		
		WebElement MFeeEF =driver.findElement(By.id("management_frequency"));
		Select MFeeEFRandom = new Select(MFeeEF);
		MFeeEFRandom.selectByVisibleText("Random");
									
		//Increment value: pecentage default,selecting fixed		
		WebElement MFeeIV =driver.findElement(By.name("management_increases_type[]"));
		Select MFeeIValue = new Select(MFeeIV);
		MFeeIValue.selectByVisibleText("Fixed");
								
		//Increment value
		WebElement MFeeInvalue =driver.findElement(By.name("management_increase_value[]"));
		MFeeInvalue.clear();
		MFeeInvalue.sendKeys("5");
												
		//For every
		WebElement MFeefor =driver.findElement(By.name("management_increases_for_every_year[]"));
		Select MFeeForEvery = new Select(MFeefor);
		MFeeForEvery.selectByVisibleText("2 Year");
				
		//-------------------------------ADMINISTRATIVE FEE dropdown clicking--------------------------//

		driver.findElement(By.xpath("//button[normalize-space()='Administrative Fee']")).click();
												
		//ADMINISTRATIVE FEE:displaying default yearly > selecting monthly
		WebElement AdminFEE = driver.findElement(By.id("administrative_ye_mo"));
		Select year7= new Select(AdminFEE);
		year7.selectByVisibleText("Monthly");
												
		WebElement expAdfee =driver.findElement(By.id("expense_administrative"));
		expAdfee.clear();
		expAdfee.sendKeys("2000");
										
		//Ecalation frequency: equal is displaying default,selecting random		
		WebElement AdFeeEF =driver.findElement(By.id("administrative_frequency"));
		Select AdFeeEFRandom = new Select(AdFeeEF);
		AdFeeEFRandom.selectByVisibleText("Random");
											
		//Increment value: pecentage default,selecting fixed		
		WebElement AdFeeIV =driver.findElement(By.name("administrative_increases_type[]"));
		Select AdFeeIValue = new Select(AdFeeIV);
		AdFeeIValue.selectByVisibleText("Fixed");
										
		//Increment value
		WebElement AdFeeInvalue =driver.findElement(By.name("administrative_increase_value[]"));
		AdFeeInvalue.clear();
		AdFeeInvalue.sendKeys("5");
														
		//For every
		WebElement AdFeefor =driver.findElement(By.name("administrative_increases_for_every_year[]"));
		Select AdFeeForEvery = new Select(AdFeefor);
		AdFeeForEvery.selectByVisibleText("2 Year");
		
		//-----------------------------------*Additional Expenses Details*--------------------------------------//
		//Additional Expenses Details dropdown clicking		
		driver.findElement(By.cssSelector(".btn.btn-link.text-white.shadow-none.collapsed[data-toggle='collapse'][data-target='#collapse-9']")).click();
				
		//Expense Name
		driver.findElement(By.id("expense_head_name")).sendKeys("Roof Replacement");
		//Expense Amount
		driver.findElement(By.id("expense_amount")).sendKeys("30,000");
				
		//Ecalation frequency: equal is displaying default,selecting random		
		WebElement AddExpEF =driver.findElement(By.id("expense_frequency0"));
		Select AddExpEFRandom = new Select(AddExpEF);
		AddExpEFRandom.selectByVisibleText("Random");
													
		//Increment value: pecentage default,selecting fixed		
		WebElement AddExpIV =driver.findElement(By.name("expense_increases_type[0][]"));
		Select AddExpIValue = new Select(AddExpIV);
		AddExpIValue.selectByVisibleText("Fixed");
												
		//Increment value
		WebElement AddExpInvalue =driver.findElement(By.name("expense_increase_value[0][]"));
		AddExpInvalue.clear();
		AddExpInvalue.sendKeys("6");
																
		//For every
		WebElement AddExpfor =driver.findElement(By.name("expense_increases_for_every_year[0][]"));
		Select AddExpForEvery = new Select(AddExpfor);
		AddExpForEvery.selectByVisibleText("4 Year");
		
		//------------------clicking on Save Investment Analysis botton--------------------------------//
	    driver.findElement(By.xpath("(//button[normalize-space()='SAVE INVESTMENT ANALYSIS'])[1]")).click();
	    
	    //In alert box clicking on save analysis button
	    driver.findElement(By.cssSelector("[value='save_investment_analysis']")).click();
	    
		//get the displaying success text
		String SuccessText =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		//Print the success text
		System.out.println(SuccessText);
		
		
	}

}
