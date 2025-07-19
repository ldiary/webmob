package config;

import java.util.Optional;

public class Environment {
    public static String requiredSystemProperty(String name) {
        return Optional.ofNullable(System.getProperty(name))
                .map(String::toUpperCase)
                .orElseThrow(() -> new RuntimeException(String.format("Please provide value for the System Property: [%s]", name)));
    }
}
