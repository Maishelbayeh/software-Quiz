package quiz.test;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature/login_feature.feature"},
		glue = { "quiz.test"},
		//tags = "@Smoke or @Regression",
		plugin = {"pretty"}
		
		)

public class AcceptanceTest {

}