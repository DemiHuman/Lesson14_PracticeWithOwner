package owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import owner.config.ApiConfig;

public class OwnerApiTest {
    ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @Test
    public void startApiTest() {

        String Url = apiConfig.getBaseUrl();
        String token = apiConfig.getToken();

        System.out.println(Url);
        System.out.println(token);
    }


}
