package steps;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import config.Environment;
import config.inject.Platform;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;

public class GuiceInjector implements InjectorSource {

    private final String platform = Environment.requiredSystemProperty("platform");

    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), Platform.valueOf(platform).getPlatformConfiguredModules());
    }
}
