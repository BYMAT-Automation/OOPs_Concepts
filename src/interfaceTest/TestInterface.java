package interfaceTest;

public class TestInterface {
	
	static WebDriver_BYMAT driver, driver_ff;
	
	public static void main(String[] args) {
		
		driver =  new ChromeDriver_BYMAT();
		
		driver.getTitle();
		driver.getURL();
		driver.clear();
		driver.click();
		driver.close();
		driver.getText();
		driver.quit();
		driver.screenShot();
		driver.xyzMathod();
		
		System.out.println("********************************");
		
	    driver_ff =  new FireFoxDriver_BYMAT();
		
	    driver_ff.getTitle();
	    driver_ff.getURL();
	    driver_ff.clear();
	    driver_ff.click();
	    driver_ff.close();
	    driver_ff.getText();
	    driver_ff.quit();
	    driver_ff.screenShot();
	    driver_ff.xyzMathod();
		
		System.out.println("********************************");
		
		ChromeDriver_BYMAT driver1 =  new ChromeDriver_BYMAT();
		
		driver1.getTitle();
		driver1.getURL();
		driver1.clear();
		driver1.click();
		driver1.close();
		driver1.getText();
		driver1.quit();
		driver1.screenShot();
		driver1.xyzMathod();
		
	}

}
