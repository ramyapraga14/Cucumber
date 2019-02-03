package Runner;

import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) //Only for JUnit//

@CucumberOptions(features= {"src/test/resources/Features"}, 
glue= "Glue", 
dryRun=true, 
monochrome= true, 
tags= {"@login", "@positive"},
format= {"html:reports","json:reports/test.json", "junit:reports/test.xml", "pretty"}) //common for both JUnit and TestNG

@Listeners({ATUReportsListener.class, ConfigurationListener.class,
	  MethodListener.class })
public class RunnerClass  extends AbstractTestNGCucumberTests{
	{
        System.setProperty("atu.reporter.config", "src/test/resources/atu.properties");
    }

}
