package Project.step.defination;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	 
	    
		public static void initializeDriver() {
	 
		    log.info("Initializing Chrome Browser...");
	 
		    driver = new ChromeDriver();
	 
		    driver.manage().window().maximize();
		    log.info("Browser maximized");
	 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    log.info("Implicit wait set to 30 seconds");
	 
		    String url = ConfigReader.getProperty("url");
		    driver.get(url);
	 
		    log.info("Navigated to URL: " + url);
	 
		  
		}
	        }

	}

}
