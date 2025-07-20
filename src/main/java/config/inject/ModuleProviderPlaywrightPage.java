package config.inject;

import com.google.inject.Provider;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.Environment;

public class ModuleProviderPlaywrightPage implements Provider<Page> {

    private static Page sessionPage;
    private final String platform = Environment.requiredSystemProperty("platform");

    public ModuleProviderPlaywrightPage() {
    }

    @Override
    public Page get() {
        if (sessionPage == null) {
            sessionPage = Playwright.create().chromium().launch().newPage();
        }
        return sessionPage;
    }
}
