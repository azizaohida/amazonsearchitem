package ListenersPack;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import amazonsaerch_dataprovidertectng.Utilities2;

public class IListeners1      extends  Utilities2  implements  ITestListener{

	public void onTestSuccess(ITestResult result) {
		this.driver = (( Utilities2)result.getInstance()).driver;
	try {
		screenshot("success_ss");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void onTestFailure(ITestResult result) {
		
	this.driver = ((Utilities2 )result.getInstance()).driver;
	
	try {
		screenshot("failed_ss");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public void onTestSkipped(ITestResult result) {
		this.driver = ((Utilities2 )result.getInstance()).driver;
			
	try {
		screenshot("skipped_ss");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

	
	
   }

