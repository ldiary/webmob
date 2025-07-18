package steps;


import io.cucumber.java.en.Given;

public class HsbcSteps  {

    @Given("I am welcome")
    public void iamwelcome() {
        System.out.println("\n\n\n Hey, you're welcome!\n\n\n");
    }
}
