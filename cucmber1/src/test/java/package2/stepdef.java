package package2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {

		@Given ("I enter {int} in this calculator")
		public void abd(int num)
		
		{
			System.out.println("I enter"+num+ "in this calculator");
		}
		@And ("I press {word}")
		public void acd(String word1)
		
		{
			System.out.println("I press"+word1);
		}
		@And("I have entered {int} in this calculator")
		public void asd(int num1)
		
		{
			System.out.println("I have entered"+num1+ "in this calculator");
		}
		@When ("I press {word} symbol")
		public void asde(String word)
		
		{
			System.out.println("I press"+word+" symbol");
		}
		@Then ("The result should be {int} on the screen")
		public void acde(int num)
		
		{
			System.out.println("The result should be"+num+ "on the screen");
		}
	}


