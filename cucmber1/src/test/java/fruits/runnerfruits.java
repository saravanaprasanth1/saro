package fruits;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:src/test/java/fruits/output/cucumber-html-report",
		          "json:src/test/java/fruits/output/cucumber.json",
		          "junit:src/test/java/fruits/output/cucumber-result.xml"})
		
public class runnerfruits {

}
