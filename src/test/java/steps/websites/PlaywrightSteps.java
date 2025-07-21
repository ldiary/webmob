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

    @Given("I want to find out what browser Playwright is actually using")
    public void getMyBrowserStep() {
        page.navigate("https://www.whatsmybrowser.org");
        System.out.println(page.locator("h2.header").first().innerText());
    }

    @After
    public void tearDown(Scenario scenario){
        page.close();
    }
}
