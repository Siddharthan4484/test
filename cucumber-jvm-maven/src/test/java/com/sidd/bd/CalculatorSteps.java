package com.sidd.bd;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URL;
 
public class CalculatorSteps {
 
    private Calculator calculator;
 
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
 
    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        assertNotNull(calculator);
        
        /*
        WebDriver driver = null;
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability("version", "");
		dc.setCapability("platform", "LINUX");
		try {
			driver = new RemoteWebDriver(new URL("http://slc15snz.us.oracle.com:4446/wd/hub"), dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://bug.oraclecorp.com/");  
		String title = driver.getTitle();	
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(title.contains("BUG")); 		
		driver.quit();
		*/
    }
 
    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        calculator.add(arg1, arg2);
    }
 
    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, calculator.getResult());
    }
}

