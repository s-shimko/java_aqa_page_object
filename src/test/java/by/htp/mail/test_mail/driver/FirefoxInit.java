package by.htp.mail.test_mail.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInit {
	
	public static String WEBDRIVER = "webdriver.gecko.driver";
	public static String WEBDRIVER_EXE_PATH = "D:\\Projects\\install\\geckodriver.exe";
	
	public FirefoxInit(){};
	
	static public WebDriver getFirefoxDriver() {
        System.setProperty(WEBDRIVER, WEBDRIVER_EXE_PATH);
		WebDriver driver = new FirefoxDriver();
		return driver;
	} 

}
