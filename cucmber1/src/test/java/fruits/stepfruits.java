package fruits;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepfruits {
 
 @Given ("There are {word} fruits") 
 public void Therearefruits (String a,DataTable t) {
	 List <Map<String,String>> data=t.asMaps(String.class,String.class);
	 System.out.println("There are"+a+"fruits with"+data.get(0).get("type"));
	 System.out.println("There are"+a+"fruits with"+data.get(1).get("type"));
	 System.out.println("There are"+a+"fruits with"+data.get(2).get("type"));
	 
 }
 @When("I eat {word} fruits")
 public void main1(String b) {
	 System.out.println("i eat"+b+"fruits"); 
 }
 @Then("I have {word} fruits")
 public void main(String c) {
	 System.out.println("i have"+c+"fruits"); 
 }	
}
