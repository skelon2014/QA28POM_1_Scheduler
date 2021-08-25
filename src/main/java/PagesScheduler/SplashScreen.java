package PagesScheduler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    //found all elements
    @FindBy(how = How.XPATH,using = "//*[@resource-id='com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;

    public String getCurrentversion(){
        return versionTextView.getText();
    }
}
