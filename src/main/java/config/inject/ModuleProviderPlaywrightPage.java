package config.inject;

import com.google.inject.Provider;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.Environment;

public class ModuleProviderPlaywrightPage implements Provider<Page> {

    private static Page sessionPage;
    private final String desiredBrowser = Environment.getSystemProperty(Environment.BROWSER);

    public ModuleProviderPlaywrightPage() {
    }

    @Override
    public Page get() {
        if (sessionPage == null) {
            if (desiredBrowser.isEmpty()) {
                // defaults to Chrome
                System.out.println("You didn't specify a browser to use. Defaulting to Chrome browser.");
                sessionPage = Playwright.create().chromium().launch().newPage();
            } else {
                if (desiredBrowser.equals(Environment.FIREFOX)) {
                    sessionPage = Playwright.create().firefox().launch().newPage();
                } else if (desiredBrowser.equals(Environment.WEBKIT)) {
                    sessionPage = Playwright.create().webkit().launch().newPage();
                } else {
                    // defaults to Chrome
                    System.out.printf("Unknown desired browser: [%s]. Available browsers are [%s], [%s], and [%s]. Defaulting to chrome.%n",
                            desiredBrowser, Environment.CHROME, Environment.FIREFOX, Environment.WEBKIT);
                    sessionPage = Playwright.create().chromium().launch().newPage();
                }
            }
        }
        return sessionPage;
    }
}
