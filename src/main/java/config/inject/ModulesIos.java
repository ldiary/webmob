package config.inject;

import com.google.inject.AbstractModule;
import config.drivers.Ios;
import io.appium.java_client.AppiumDriver;
import projects.hsbc.business.WelcomScreen;
import projects.hsbc.ios.WelcomeScreenIos;

public class ModulesIos extends AbstractModule {

    @Override
    protected void configure(){
        bind(AppiumDriver.class).to(Ios.class);
        bind(WelcomScreen.class).to(WelcomeScreenIos.class);
    }
}
