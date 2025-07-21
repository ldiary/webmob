How to configure test runner in Cucumber with JUnit 5 so that it scans `selected directories` and only runs the tests whose scenario name is the same as the one  specified in the `filter name`?
```java
@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/features")
@ConfigurationParameter(key = Constants.FILTER_NAME_PROPERTY_NAME,value = "Welcoming customer")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "steps")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/cucumber.html")
public class RunCucumberTest { }
```

This can be further simplified to contain just the minimal annotations:
```java
@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/java/features")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/cucumber.html")
public class RunCucumberTest { }
```

The rest of the Cucumber options can be moved to `gradle.properties` like below:
```declarative
systemProp.platform=playwright
#systemProp.browser=firefox
systemProp.cucumber.filter.name=Find out my current browser details
systemProp.cucumber.glue=steps/inject,steps/websites
```