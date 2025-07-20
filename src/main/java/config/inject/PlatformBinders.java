package config.inject;

import com.google.inject.Module;

public enum PlatformBinders {
    ANDROID ("Android OS mobile device") {
        @Override
        public Module getPlatformConfiguredModules(){
            System.out.println(this);
            return new ModuleBinderAndroid();
        }
    },
    IOS ("iOS mobile device") {
        @Override
        public Module getPlatformConfiguredModules() {
            System.out.println(this);
            return new ModuleBinderIos();
        }
    },
    PLAYWRIGHT("playwright controlled web browser"){
        @Override
        public Module getPlatformConfiguredModules() {
            System.out.println(this);
            return new ModuleBinderPlaywright();
        }
    };

    private final String description;

    PlatformBinders(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Configuring platform bindings for an %s.", description);
    }

    public abstract Module getPlatformConfiguredModules();
}
