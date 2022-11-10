//package stepdefination;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import hooks.hooksclass;
//
//public class stepdefinationclass {
//	
//	WebDriver driver = hooksclass.driver;
//	
//	
//	@Given("User navigates to facebook application")
//	public void user_navigates_to_facebook_application() {
//	   System.out.println("user is navigating to the facebook application");
//	   
//	   driver.get("https://www.facebook.com/");
//	}
//	
//	@When("user enters valid credentials")
//	public void user_enters_valid_credentials() {
//	   
//	}
//
//	@Then("user logged in successfully")
//	public void user_logged_in_successfully() {
//	    
//	}
//
//	@When("user enters invalid credentials")
//	public void user_enters_invalid_credentials() {
//	   
//	}
//
//	@Then("user gets validation message")
//	public void user_gets_validation_message() {
//	    
//	}
//	
//	//@When("user enter {string} username and {string} password")
//	public void user_enter_username_and_password(String username, String pass) {
//	    driver.findElement(By.id("email")).sendKeys(username);
//	    driver.findElement(By.id("pass")).sendKeys(pass);
//	    driver.quit();
//	}
//	
//	@Given("User navigates to elearning application")
//	public void user_navigates_to_elearning_application() {
//	   System.out.println("user is navigating to the elearning application");
//	   
//	   driver.get("http://elearningm1.upskills.in/index.php");
//	}
//	
//	@When("user enters valid credentials")
//	public void user_enters_valid_credential() {
//	   
//	}
//
//	@Then("user logged in successfully")
//	public void user_logged_in_successfull() {
//	    
//	}
//	
//
//
//
//	
//
//}
