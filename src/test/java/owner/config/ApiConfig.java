package owner.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/config/api.properties"
})

public interface ApiConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("token")
    String getToken();
}
