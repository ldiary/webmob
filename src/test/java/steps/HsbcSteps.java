package steps;


import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import projects.hsbc.business.WelcomScreen;

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
}
