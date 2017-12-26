package by.htp.mail.test_mail.abstract_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebdriver extends AbstractDriver {
	
	private WebDriver webdriver;
	
	public static String WEBDRIVER = "webdriver.gecko.driver";
	public static String WEBDRIVER_EXE_PATH = "D:\\Projects\\install\\geckodriver.exe";
	
	public FirefoxWebdriver() {
        System.setProperty(WEBDRIVER, WEBDRIVER_EXE_PATH);
		webdriver = new FirefoxDriver();
	}

	@Override
	public WebDriver getWebdriver() {
		return this.webdriver;
	}

}
