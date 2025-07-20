package config.inject;

import com.google.inject.AbstractModule;
import io.appium.java_client.AppiumDriver;
import mobiles.hsbc.business.WelcomScreen;
import mobiles.hsbc.android.WelcomeScreenAndroid;

public class ModuleBinderAndroid extends AbstractModule {
    @Override
    protected void configure(){
        bind(AppiumDriver.class).toProvider(ModuleProviderAppiumDriver.class);
        bind(WelcomScreen.class).to(WelcomeScreenAndroid.class);
    }
}
