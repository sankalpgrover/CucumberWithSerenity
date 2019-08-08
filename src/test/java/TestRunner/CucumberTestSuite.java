package TestRunner;

import java.io.File;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

//****Conceptually both step definitions and hooks are global (if they are on the classpath step definitions can be used, 
//and hooks will be executed), the class they are defined in a secondary, 
//so there is really no concept for speaking about "the hooks of the classes from which step definitions are actually used".
//Having said that, execution would need to be controlled by "tags"

//******Why we can't extend classes in Cucumber with hooks or step defs ?

/*Cucumber creates a new instance of all classes defining stepdefs before each scenario.
It then invokes stepdef methods on *one* of those instances whenever it needs to run a step.

If you defined a stepdef method abc in class A and you have a class B extends A you'd get an a and b instance.
The abc method would be available on both instances, and Cucumber would not be able to decide what instance to invoke the method on.

That's why we don't allow it.*/

//**How to use Tagging in cucumber
//(OR condition)-- tags = {"@SmokeTest, @wip"} Execute all scenarios that are under the @SmokeTest tag or under the @wip tag
//(AND condition)-- tags = {"@SmokeTest," "@RegressionTest"} Execute all scenarios that are under the @SmokeTest and @RegressionTest tags .
//(Ignore Tag Syntax)-- tags = {"~@SmokeTest"} ignores all scenarios under the @SmokeTest tag
//(Include and Exclude combination)-- tags = {"@RegressionTest, ~@SmokeTest"} executes all scenarios under the @RegressionTest tag, but ignores all scenarios under the @SmokeTest tag
//tags = {"@gui," "~@SmokeTest," "~@RegressionTest"} ignores all the scenarios under the tag @SmokeTest and @RegressionTest but executes all those under the tag "@gui.

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "features"},
				 glue = {"com.ttn.stepdefinition"},tags={},
				strict = true, monochrome = true)


public class CucumberTestSuite {

	// Please be informed that you can not quote any hooks or cucumber
	// annotations inside Runner class
	// Dynamically specify path/properties for the report

	public static void deleteFolder(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                deleteFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	    folder.delete();
	}

}
