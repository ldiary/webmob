package steps;


import com.google.inject.Inject;
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
}
