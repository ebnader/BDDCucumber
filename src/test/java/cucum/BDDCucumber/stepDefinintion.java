package cucum.BDDCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinintion {
	WebDriver driver;
	@Given("^user is in loging page$")
	public void user_is_in_loging_page() throws Throwable {
	//System.setProperty("WebDriver.chrome.driver", "ChromeDriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	   
	}

	@When("^user enters user name$")
	public void user_enters_user_name() throws Throwable {
		//driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
	   
	}

	@When("^User enters the password$")
	public void user_enters_the_password() throws Throwable {
		//driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@alt='Sign-In']")).click();
	
	  }

	@Then("^user be able to see the flight details$")
	public void user_be_able_to_see_the_flight_details() throws Throwable {
	System.out.println("im at then");
	    throw new PendingException();
	}

	@Given("^user is in Flight details page$")
	public void user_is_in_Flight_details_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("im at a Given flight");
	    throw new PendingException();
	}

	@When("^user click on \\(X\\) to close the page$")
	public void user_click_on_X_to_close_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When click close");
	    throw new PendingException();
	}

	@Then("^Browser is closed$")
	public void browser_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("clsoed");
	    throw new PendingException();
	}




}
