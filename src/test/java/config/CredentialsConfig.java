package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config {
    @Key("remoteUrl")
    String remoteUrl();

    @Key("login")
    String login();

    @Key("password")
    String password();
}
