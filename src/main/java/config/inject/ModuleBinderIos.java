package config.inject;

import com.google.inject.AbstractModule;
import io.appium.java_client.AppiumDriver;
import projects.hsbc.business.WelcomScreen;
import projects.hsbc.ios.WelcomeScreenIos;

public class ModuleBinderIos extends AbstractModule {

    @Override
    protected void configure(){
        bind(AppiumDriver.class).toProvider(ModuleProviderAppiumDriver.class);
        bind(WelcomScreen.class).to(WelcomeScreenIos.class);
    }
}
