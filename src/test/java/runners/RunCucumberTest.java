package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/java/features/")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "steps")
@ConfigurationParameter(key = Constants.FILTER_NAME_PROPERTY_NAME,value = "Welcoming customer")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/cucumber.html")
public class RunCucumberTest { }