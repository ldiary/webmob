package config.drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android extends AndroidDriver {

    public Android() throws MalformedURLException {
        super(new URL(String.format("",123)), new DesiredCapabilities());
    }
}
