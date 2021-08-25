package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;




/*      "deviceName": "Nex5",
        "platformName": "Android",
        "platformVersion": "8.0",
        "appPackage": "com.example.svetlana.scheduler",
        "appActivity": ".presentation.splashScreen.SplashScreenActivity"   */

public class ConfigScheduler {
    protected AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Nex5");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");//можно по аналогии 1-2
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        capabilities.setCapability( "appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability( "appActivity", ".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app","D:\\TELRAN\\Testing\\APK\\v.0.0.3.apk");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
