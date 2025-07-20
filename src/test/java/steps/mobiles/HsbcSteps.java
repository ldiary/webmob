package steps.mobiles;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Stage;
import config.Environment;
import config.inject.PlatformBinders;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import io.cucumber.java.en.Given;
import mobiles.hsbc.business.WelcomScreen;

public class HsbcSteps  {
    WelcomScreen welcomScreen;

    @Inject
    public HsbcSteps(WelcomScreen welcomScreen) {
        this.welcomScreen = welcomScreen;
    }

    @Given("I am welcome")
    public void iamwelcome() {
        welcomScreen.greetings();
    }

    public static class GuiceInjector implements InjectorSource {

        private final String platform = Environment.requiredSystemProperty("platform");

        @Override
        public Injector getInjector() {
            System.out.println("Your platform seen by guice injector is: " + platform);
            return Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), PlatformBinders.valueOf(platform).getPlatformConfiguredModules());
        }
    }
}
