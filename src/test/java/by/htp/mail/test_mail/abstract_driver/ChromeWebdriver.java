package by.htp.mail.test_mail.abstract_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebdriver extends AbstractDriver {
	
	private WebDriver webdriver;
	
	public static String WEBDRIVER = "webdriver.chrome.driver";
	public static String WEBDRIVER_EXE_PATH = "D:\\Projects\\install\\chromedriver.exe";
	
	public ChromeWebdriver() {
        System.setProperty(WEBDRIVER, WEBDRIVER_EXE_PATH);
		webdriver = new ChromeDriver();
	}

	@Override
	public WebDriver getWebdriver() {
		return this.webdriver;
	}

}
