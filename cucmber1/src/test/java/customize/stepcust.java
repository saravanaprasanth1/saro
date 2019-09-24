package customize;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepcust {
	@Given ("I am a {word} tester")
	public void abd(String word)
	
	{
		System.out.println("I am a"+ word+ "tester");
	}
	@When("I go to work")
	public void acd ()
	
	{
		System.out.println("I go to work");
	}
	@Then("I {word} it")
	public void asd(String word)
	
	{
		System.out.println("I" +word+"it");
	}
	@And ("My boss {word} me")
	public void asde(String word)
	
	{
		System.out.println("My boss"+word+"me");
	
	}
	@And ("The developer {word} me")
	public void asdee(String word)
	
	{
		System.out.println("The developer"+word+"me");
	
	}
	
}



