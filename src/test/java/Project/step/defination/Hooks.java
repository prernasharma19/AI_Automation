package Project.step.defination;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	    @Before

	    public void setUp(Scenario scenario) {
	 
	        BaseClass
	 
	       

	    }
	 
	    @After

	    public void tearDown(Scenario scenario) {
	 
	        if (scenario.isFailed()) {
	 
	            try {
	 
	                // Screenshot for Cucumber report

	                byte[] screenshot = ((TakesScreenshot) BaseClass.driver)

	                        .getScreenshotAs(OutputType.BYTES);
	 
	                scenario.attach(screenshot, "image/png", "Failed Screenshot");
	 
	                // Scenario name clean

	                String scenarioName = scenario.getName().replaceAll(" ", "_");
	 
	                // Screenshot save

	                File src = ((TakesScreenshot) BaseClass.driver)

	                        .getScreenshotAs(OutputType.FILE);
	 
	                String path = "target/screenshots/" + scenarioName + ".png";
	 
	                File dest = new File(path);
	 
	                FileUtils.copyFile(src, dest);
	 
	                // Extent report screenshot

	                extentTest.get().fail("Test Failed",

	                        MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	 
	            } catch (Exception e) {

	                e.printStackTrace();

	            }

	        }
	 
	        BaseClass.driver.quit();

	        extent.flush();

	    }
	 
	    public static WebDriver getDriver() {

	        return BaseClass.driver;

	    }
	 
	    public static ExtentTest getTest() {

	        return extentTest.get();

	    }

	}
	 

	}

}
