package testScheduler;

import PagesScheduler.SplashScreen;
import config.ConfigScheduler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchAppTest extends ConfigScheduler {

    @Test
    public void launchTest(){
        String version = new SplashScreen(driver).getCurrentversion();
        Assert.assertEquals(version,"0.0.3");
    }


}
