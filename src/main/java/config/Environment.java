package config;

import java.util.Optional;

public class Environment {

    public final static String PLATFORM = "platform";
    public final static String BROWSER = "browser";
    public final static String CHROME = "chrome";
    public final static String FIREFOX = "firefox";
    public final static String WEBKIT = "webkit";

    public static String requiredSystemProperty(String name) {
        String value = Optional.ofNullable(System.getProperty(name))
                .map(String::toUpperCase)
                .orElseThrow(
                        // This is a Supplier (of an Exception)
                        () -> new RuntimeException(String.format("Please provide value for the System Property: [%s]", name))
                );
        System.out.printf("System Property: %s = %s%n", name, value);
        return value;
    }

    public static String getSystemProperty(String name) {
        return Optional.ofNullable(System.getProperty(name))
                .orElseGet(
                        // Another supplier
                        () -> Optional.empty().toString()
                );
    }
}
