package steps;


import io.cucumber.java8.En;

public class HsbcSteps implements En {

    public HsbcSteps() {
        Given("I am welcome", () -> {
            System.out.println("\n\n\n Hey, you're welcome!\n\n\n");
        });
    }
}
