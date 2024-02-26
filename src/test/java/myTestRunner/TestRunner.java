package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features",//or give the path only the folder 
		//features="/Users/subhamkumar/eclipse-workspace/CucumberProject/Features/Tagging.feature",
		features="/Users/subhamkumar/eclipse-workspace/CucumberProject/Features/Hooks.feature",
		glue="StepDefination", // need to specify the package name where step definations are kept
		dryRun=false,//by default it is false.
		monochrome=true,
		plugin={"pretty","html:test-output.html","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},//used for generating the junit report. json and xml repost can be generated
		//tags= "@SanityTest"// will execute only sanity Test
		//tags= "@SanityTest and @End2End"//will execute scenarios comming under sanity and regression
		//tags= "@RegressionTest or @End2End"///will execute scenarios comming under sanity or regression
		tags="not @End2End"// will ignore End2EndScenarios and run all other
		//tags="~@SanityTest and ~@End2End"
		)
public class TestRunner {

	
}