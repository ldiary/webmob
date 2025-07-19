package config.inject;

import com.google.inject.Provider;
import config.Environment;
import config.drivers.BuilderAndroidDriver;
import config.drivers.BuilderIosDriver;
import io.appium.java_client.AppiumDriver;

public class ProviderAppiumDriver implements Provider<AppiumDriver> {

    private static AppiumDriver sessionDriver;
    private final String platform = Environment.requiredSystemProperty("platform");

    public ProviderAppiumDriver() {
    }

    @Override
    public AppiumDriver get() {
        if (sessionDriver == null) {
            if (platform.equalsIgnoreCase("ios")) {
               sessionDriver = new BuilderIosDriver().buildIosDriver();
            } else {
               sessionDriver = new BuilderAndroidDriver().buildAndroidDriver();
            }
        }
        return sessionDriver;
    }
}
