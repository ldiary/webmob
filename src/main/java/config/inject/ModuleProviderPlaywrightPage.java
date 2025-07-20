package config.inject;

import com.google.inject.Provider;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import config.Environment;
import config.drivers.PlaywrightBrowsers;

public class ModuleProviderPlaywrightPage implements Provider<Page> {

    private static Page sessionPage;
    private final String browser = Environment.requiredSystemProperty("browser");

    public ModuleProviderPlaywrightPage() {
    }

    @Override
    public Page get() {
        if (sessionPage == null) {
            if (browser.equals(PlaywrightBrowsers.FIREFOX.name())) {
                sessionPage = Playwright.create().firefox().launch().newPage();
            } else if (browser.equals(PlaywrightBrowsers.WEBKIT.name()))  {
                sessionPage = Playwright.create().webkit().launch().newPage();
            }
            else {
                sessionPage = Playwright.create().chromium().launch().newPage();
            }
        }
        return sessionPage;
    }
}
