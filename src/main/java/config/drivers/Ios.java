package config.drivers;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Ios extends IOSDriver {

    public Ios() throws MalformedURLException {
        super(new URL(String.format("",123)), new DesiredCapabilities());
    }
}
