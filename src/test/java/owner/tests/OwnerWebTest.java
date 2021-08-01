package owner.tests;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import owner.config.WebConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class OwnerWebTest {
    WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Test
    void startWebTest() {

        Configuration.browser = webConfig.getBrowser();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        Configuration.startMaximized = true;

        if (webConfig.isRemote()) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = webConfig.getSelenoidUrl();
        }

        open("https://ya.ru");
        sleep(5000);
    }
}
