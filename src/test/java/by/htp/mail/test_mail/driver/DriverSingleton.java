package by.htp.mail.test_mail.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {
    private static WebDriver driver;
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.chrome.driver";
//    private static final String GECKODRIVER_GECKODRIVER_EXE_PATH = "D:\\Projects\\install\\geckodriver.exe";
    private static final String GECKODRIVER_GECKODRIVER_EXE_PATH = "/home/dev/Downloads/install/chromedriver";

    private DriverSingleton(){};


    public static WebDriver getDriver(){
        if (null == driver){
            System.setProperty(WEBDRIVER_GECKO_DRIVER, GECKODRIVER_GECKODRIVER_EXE_PATH);
//            driver = new FirefoxDriver();
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
