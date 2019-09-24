package cucmber.cucmber1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefi {
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
}