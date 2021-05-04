package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.BillingPage;
import pages.CustomerInvoicePage;
import pages.LoginPage;
import pages.HomePage;
import pages.InvoicePage;
import pages.ListPage;

public class BaseTest {
	static WebDriver driver;
	static final String url = "https://demo.dolibarr.org/public/demo/index.php";
	static LoginPage loginpage;
	static HomePage homepage;
	static BillingPage billingpage;
	static InvoicePage invoicepage;
	static ListPage listpage;
	static CustomerInvoicePage cip;

	@BeforeSuite
	// @Test
	public void setUpBrowser() {

		System.setProperty("webdriver.chrome.driver", "/Users/tawhidchowdhury/Downloads/chromedriver");

		driver = new ChromeDriver();

	}

	public LoginPage getDolibarPage() {

		loginpage = new LoginPage(driver);

		return loginpage;
	}

	public HomePage gethomePage() {

		homepage = new HomePage(driver);

		return homepage;
	}

	public BillingPage getBillingPage() {

		billingpage = new BillingPage(driver);

		return billingpage;
	}

	public InvoicePage getInvoicePage() {

		invoicepage = new InvoicePage(driver);

		return invoicepage;
	}

	public static WebDriver getWebDriver() {

		return driver;
	}

	public ListPage getListPage() {
		listpage = new ListPage(driver);
		return listpage;
	}
	public CustomerInvoicePage getCustomerInvoicePage() {
		cip=new CustomerInvoicePage(driver);
		
		return  cip;
	}

	@BeforeMethod
	public void logIn() {
		driver.get(url);
		getDolibarPage();
		loginpage.clickOnCMP();
		loginpage.clickOnLgin().click();
	}
@AfterMethod
public void logOut() {
	loginpage.clickOnProfile();
	loginpage.clickOnLogOut();
}

}
