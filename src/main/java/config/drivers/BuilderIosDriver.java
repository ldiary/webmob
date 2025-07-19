package config.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;

public class BuilderIosDriver {

    public AppiumDriver buildIosDriver() {
        try {
            URI uri = new URI("http://nowhere");
            return new IOSDriver(uri.toURL(), new DesiredCapabilities());
        } catch (Exception error) {
            throw new RuntimeException("Failed to build iOS Driver", error);
        }
    }
}
