package ss;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepss {

	@Given ("I enter 50 in this calculator")
	public void abd()
	
	{
		System.out.println("I enter 50 in this calculator");
	}
	@And ("I press add")
	public void acd()
	
	{
		System.out.println("I press add");
	}
	@And("I have entered 50 in this calculator")
	public void asd()
	
	{
		System.out.println("I have entered 50 in this calculator");
	}
	@When ("I press equal symbol")
	public void asde()
	
	{
		System.out.println("I press equal symbol");
	}
	@Then ("The result should be 100 on the screen")
	public void acde()
	
	{
		System.out.println("The result should be 100 on the screen");
	}
	
	@Given ("I enter 40 in this calculator")
	public void abdw()
	
	{
		System.out.println("I enter 40 in this calculator");
	}
	/* @And ("I press add")
	public void acd1()
	
	{
		System.out.println("I press add");
	}
	@And("I have entered 50 in this calculator")
	public void asd2()
	
	{
		System.out.println("I have entered 50 in this calculator");
	}
	@When ("I press equal symbol")
	public void asde3()
	
	{
		System.out.println("I press equal symbol");
	}
	@Then ("The result should be 100 on the screen")
	public void acde4()
	
	{
		System.out.println("The result should be 100 on the screen");
	}*/
	
}
