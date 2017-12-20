package by.htp.mail.test_mail.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static public WebDriver createDriver(String type) {
		WebDriver driver = null;

		if (type.equals("firefox")) {
		    String WEBDRIVER = "webdriver.gecko.driver";
		    String WEBDRIVER_EXE_PATH = "D:\\Projects\\install\\geckodriver.exe";
            System.setProperty(WEBDRIVER, WEBDRIVER_EXE_PATH);
			driver = new FirefoxDriver();
			
		} else if (type.equals("chrome")) {
		    String WEBDRIVER = "webdriver.chrome.driver";
		    String WEBDRIVER_EXE_PATH = "D:\\Projects\\install\\chromedriver.exe";
            System.setProperty(WEBDRIVER, WEBDRIVER_EXE_PATH);
			driver = new ChromeDriver();
			
		} else {
			System.out.println("Wrong driver name");
		}

		return driver;
	}

}
