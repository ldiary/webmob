package config.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;

public class BuilderAndroidDriver {

    public AppiumDriver buildAndroidDriver() {
        try {
            URI uri = new URI("http://nowhere");
            return new AndroidDriver(uri.toURL(), new DesiredCapabilities());
        } catch (Exception error) {
            throw new RuntimeException("Failed to build iOS Driver", error);
        }
    }
}
