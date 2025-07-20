package config.inject;

import com.google.inject.AbstractModule;
import io.appium.java_client.AppiumDriver;
import mobiles.hsbc.business.WelcomScreen;
import mobiles.hsbc.ios.WelcomeScreenIos;

public class ModuleBinderIos extends AbstractModule {

    @Override
    protected void configure(){
        bind(AppiumDriver.class).toProvider(ModuleProviderAppiumDriver.class);
        bind(WelcomScreen.class).to(WelcomeScreenIos.class);
    }
}
