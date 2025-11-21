import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class sampleTest {

    public static void main(String[] args) throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("AndroidDevice");
        options.setAppPackage("com.bonnet.test");
        options.setAppActivity("com.bonnet.views.MainActivity");
        options.setAutomationName("UiAutomator2");

        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/wd/hub"),
                options
        );

        Thread.sleep(2000);

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().textContains(\"Log in\")"
        )).click();

        Thread.sleep(1000);

        driver.quit();
    }
}
