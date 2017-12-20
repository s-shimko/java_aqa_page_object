package by.htp.mail.test_mail.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {
    private static WebDriver driver;
    private static final String WEBDRIVER = "firefox";
//    private static final String WEBDRIVER = "chrome";

    private DriverSingleton(){};

    public static WebDriver getDriver(){
        if (null == driver){
        	driver = DriverFactory.createDriver(WEBDRIVER);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
