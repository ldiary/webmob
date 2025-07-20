package config.inject;

import com.google.inject.AbstractModule;
import com.microsoft.playwright.Page;

public class ModuleBinderPlaywright extends AbstractModule {

    @Override
    protected void configure(){
        bind(Page.class).toProvider(ModuleProviderPlaywrightPage.class);
    }
}
