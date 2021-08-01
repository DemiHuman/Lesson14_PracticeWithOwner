package owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/web/${stage}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("remote")
    Boolean isRemote();

    @Key("selenoidUrl")
    String getSelenoidUrl();
}
