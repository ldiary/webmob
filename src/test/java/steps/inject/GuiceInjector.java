package steps.inject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import config.Environment;
import config.inject.PlatformBinders;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;

public class GuiceInjector implements InjectorSource {

    private final String desiredPlatform = Environment.requiredSystemProperty(Environment.PLATFORM);

    @Override
    public Injector getInjector() {
        return Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), PlatformBinders.valueOf(desiredPlatform).getPlatformConfiguredModules());
    }
}
