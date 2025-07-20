package config.inject;

import com.google.inject.AbstractModule;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ModuleBinderPlaywright extends AbstractModule {

    @Override
    protected void configure(){
        bind(Page.class).toProvider(ModuleProviderPlaywrightPage.class);
    }
}
