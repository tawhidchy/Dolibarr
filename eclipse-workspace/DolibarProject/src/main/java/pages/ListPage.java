package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import model.HomeModel;
import model.ListPageModel;

public class ListPage extends ListPageModel {

	public ListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//	public void clickOnList() {
//		 getList().click();
//		
//	}
//	public void clickOnRefTextBox() {
//		getRefTextBox().click();
//	}
//	public void clickOnSearchButton() {
//		getSearchButton().click();
//	}

	public void verifyName(String ExpName) {
		String actName	=getVerifyName().getText();
		
		Assert.assertEquals(actName, ExpName);
		
		}
		public void verifyProject(String Expname) {
			String actName=getVerifyProject().getText();
			Assert.assertEquals(actName, Expname);
			
			
		}
		public void verifyType(String Exptype) {
			String actType=getVerifyProjectType().getText();
			Assert.assertEquals(actType, Exptype);
		}
		public void verifyDate(String ExpDate) {
			String actDate=getVerifyDate().getText();
			Assert.assertEquals(actDate, ExpDate);
		}
		public void verifyTerms(String ExpTerms) {
			String actTerms= getVerifyTerms().getText();
			Assert.assertEquals(actTerms, ExpTerms);
			
		}
		public void verifyDueDate(String ExpDate) {
			String acctDate=getVerifyPaymentDueDate().getText();
			Assert.assertEquals(acctDate, ExpDate);
			
		}
		public void verifyPaymentType(String ExpType) {
			String acctPType=getVerifyPaymentType().getText();
			Assert.assertEquals(acctPType, ExpType);
		}
		public void verifyCurrency(String ExpCurrency) {
			String acctCurrency=getVerifyCurrency().getText();
			Assert.assertEquals(acctCurrency, ExpCurrency);
		}
		
		public void verifyBAnkAccount(String ExpAC) {
			String acctAccount=getVerifyBankAccount().getText();
			Assert.assertEquals(acctAccount, ExpAC);
		}
		public void verifyExtra(String ExpExtra) {
			String acctExtra=getVerifyExtra().getText();
			Assert.assertEquals(acctExtra, ExpExtra);
		}
		
		public String getProjecttext(String Expproject) {
			String text=getProjectText1().getText();
			String p []=text.split("\n");
			String acctProject=p[3].split(" : ")[1];
			Assert.assertEquals(acctProject, Expproject);
			return acctProject;
		}

}
