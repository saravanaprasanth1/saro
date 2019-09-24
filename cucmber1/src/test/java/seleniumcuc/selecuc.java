package seleniumcuc;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

import cucmber.cucmber1.browserclass;
import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class selecuc {
		WebDriver driver;
		@Before
		public void a()
		{
			 driver=browserclass.openBrowser("chrome");
	System.out.println("before Scenario");
	PageFactory.initElements(driver, classfile.class);
		}
		@After
		public void b()
		{
			System.out.println("After Scenario");
			driver.close();
		}
	@Given("Enter the url {string}")
	public void c(String string) {
	driver.get(string);
	}
	@When("user enter {string} as username")
	public void d(String string) {
		classfile.username.sendKeys(string);

	}
	@When("user enter {string} as password")
	public void e(String string) {
		classfile.pwd.sendKeys(string);

	}
	@Then("user Logins to TestMeApp")
	public void f() {
		driver.findElement(By.linkText("Login")).click();
		
	}
	}

