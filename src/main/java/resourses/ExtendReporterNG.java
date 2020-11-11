package resourses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	
	static ExtentReports extent;
	
	public static ExtentReports getReportOject()
	{
		//ExtentReports, ExtentSparkReports
		
				//ExtentSparkReports is helper class which will do some intial configurations and pass reports to main calss
				String path = System.getProperty("user.dir")+"\\reports\\index.html";
				ExtentSparkReporter reports = new ExtentSparkReporter(path);
				reports.config().setReportName("Web Automation Report");
				reports.config().setDocumentTitle("Test Results");
				
			    extent = new ExtentReports();
				extent.attachReporter(reports); //once report is created it is attached to main class
				extent.setSystemInfo("Tester", "Sneha");
				
				return extent;
	}

}
