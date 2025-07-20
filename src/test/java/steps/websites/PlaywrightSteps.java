package steps.websites;


import com.google.inject.Inject;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class PlaywrightSteps {
    Page page;

    @Inject
    public PlaywrightSteps(Page page) {
        this.page = page;
    }

    @Given("I am welcome in playwright")
    public void iamWelcomeInPlaywright() {
        page.navigate("https://playwright.dev/java/");
        System.out.println(page.title());
    }

    @After
    public void tearDown(Scenario scenario){
        page.close();
    }
}
