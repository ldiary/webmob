package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.*;


@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/features")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/cucumber.html")
public class RunCucumberTest { }