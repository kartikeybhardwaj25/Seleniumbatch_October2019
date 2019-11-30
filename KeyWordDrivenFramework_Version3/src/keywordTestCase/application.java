	package keywordTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.ReadExcel;

public class application {
  @Test
  public void applicationTest() throws IOException {
	  
	  String[][] data = ReadExcel.getData("C:\\Users\\kartikey\\eclipse-workspace\\KeyWordDrivenFramework_Version2\\src\\TestData\\KeyWord_TestCase_v1.xlsx", "Sheet2");
	  String[][] data1 = ReadExcel.getData("C:\\Users\\kartikey\\eclipse-workspace\\KeyWordDrivenFramework_Version2\\src\\TestData\\KeyWord_TestCase_v1.xlsx", "Sheet1");
	  for(int j=0;j<data1.length;j++) {
	  for(int i=1;i<data.length;i++) {
		  
		switch(data[i][3]) {
		case "openBrowser":
			methods.openBrowser();
			break;
			
		case "maximizeWindow":
			methods.maximizeWindow();
			break;
			
		case "implementWait":
			methods.implementWait();
			break;
			
		case "navigateTo":
			methods.navigateTo(data[i][6]);
			break;	
			
		case "enterUserName":
			methods.enterUsername(data[i][5], data1[j][0]);
			break;		
			
		case "enterPassword":
			methods.enterpassword(data[i][5], data1[j][1]);
			break;	
			
		case "clickSubmit":
			methods.ClickSubmit(data[i][5]);
			break;	
			
		case "verifyMessage":
			methods.VerifyMessage(data[i][5], data[i][6]);
			break;	
			
		case "closeBrowser":
			methods.closebrowser();
			break;	
			
			
		}
	  }
  }
}
}
