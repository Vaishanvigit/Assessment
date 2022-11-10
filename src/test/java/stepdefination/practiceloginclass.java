package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;

public class practiceloginclass {
	
		//WebDriver driver;
		WebDriver driver = new ChromeDriver();
		

	    @Given("user is on login page")
	    public void user_is_on_login_page()  {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishnavi Rao\\Desktop\\IBM_Nov\\lib\\chromedriver.exe");
			
			
			
			driver.get("http://elearningm1.upskills.in/index.php");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("login")).sendKeys("test");
	        driver.findElement(By.id("password")).sendKeys("test123");
	        driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).click();
	        
	        //driver.findElement(By.name("next")).sendKeys("abcd@123");
	        //driver.findElement(By.xpath("//a[@href='#']")).click();
	        //driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php']")).click(); 
	        //driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new-message.png']")).click();
	        //driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']//li[@class= 'select2-search select2-search--inline']//input[@class='select2-search__field']")).sendKeys("abc"); 
	        //driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ami");
	        //driver.findElement(By.xpath("//input[@placeholder='Please select an option']")).sendKeys("huiio");
	        //driver.findElement(By.name("title")).sendKeys("validation");
	        //driver.findElement(By.name("compose")).click();
	        
	         
	        System.out.println("Login page of the application is opened.");
	    //throw new cucumber.api.PendingException();
	         
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.get("http://elearningm1.upskills.in/main/auth/inscription.php");
		
        driver.findElement(By.name("firstname")).sendKeys("abcd");
        driver.findElement(By.name("lastname")).sendKeys("12345");
        driver.findElement(By.name("email")).sendKeys("abcd@mail.com");
        driver.findElement(By.id("username")).sendKeys("lplx12");
        driver.findElement(By.id("pass1")).sendKeys("pass12");
        driver.findElement(By.id("pass2")).sendKeys("pass12");
        driver.findElement(By.name("submit")).click();
		//driver.findElement(By.id("login")).sendKeys("test");
        //driver.findElement(By.id("password")).sendKeys("test123");
        //driver.findElement(By.xpath("//a[@href=\"http://elearningm1.upskills.in/main/auth/inscription.php\\"));
        System.out.println("Username and password entered in the application");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("clicks on login butoon")
	public void clicks_on_login_butoon() {
		driver.get("http://elearningm1.upskills.in/index.php");
		driver.findElement(By.id("login")).sendKeys("lplx12");
		driver.findElement(By.id("password")).sendKeys("pass12");
        driver.findElement(By.name("submitAuth")).click();
        //driver.findElement(By.name("next")).sendKeys("abcd@123");
		//driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php?f=social']")).click();
         //driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php']")).click(); 
         //driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new-message.png']")).click();
         //driver.findElement(By.xpath("//input[@placeholder='Please select an option']")).sendKeys("huiio");
         //driver.findElement(By.name("title")).sendKeys("validation");
         //driver.findElement(By.name("compose")).click();
         // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		//driver.get("http://elearningm1.upskills.in/index.php");
		 
		//driver.findElement(By.name("next")).sendKeys("abcd@123");
		driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php?f=social']")).click();
         //driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php']")).click(); 
         driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new-message.png']")).click();

         //driver.findElement(By.xpath("select2 select2-container select2-container--default select2-container--below select2-container--focus select2-container--open']")).click();
         //Select se = new Select();
         //Select se = new Select(driver.findElement(By.id("select2 select2-container select2-container")));
//         se.selectByVisibleText("A B");

//driver.findElement(By.xpath("//span[@class=select2 select2-container select2-container--default select2-container--below select2-container--focus select2-container--open'][select2-selection select2-selection--multiple][select2-selection__rendered]")).click();
//// Select the option by index
//se.selectByIndex(1);
         //se = driver.find_element_by_css_selector("span[class='select2 select2-container select2-container--default select2-container--below select2-container--focus']")
        		 //se.click();

//         driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']//li[@class= 'select2-search select2-search--inline']//input[@class='select2-search__field']")).sendKeys("123"); 
//         driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("A B");
       driver.findElement(By.xpath("//input[@placeholder='Please select an option']")).sendKeys("abc");
         driver.findElement(By.name("title")).sendKeys("validation");
         driver.findElement(By.name("compose")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	 


}
