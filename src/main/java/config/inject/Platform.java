package config.inject;

import com.google.inject.Module;

public enum Platform {
    IOS {
        @Override
        public Module getPlatformConfiguredModules() {
          return new ModulesIos();
        }
    },
    ANDROID {
        @Override
        public Module getPlatformConfiguredModules(){
            return new ModulesAndroid();
        }
    };

    public abstract Module getPlatformConfiguredModules();
}
