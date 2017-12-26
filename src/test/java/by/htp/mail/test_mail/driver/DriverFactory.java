package by.htp.mail.test_mail.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import by.htp.mail.test_mail.abstract_driver.AbstractDriver;
import by.htp.mail.test_mail.abstract_driver.FirefoxWebdriver;
import by.htp.mail.test_mail.abstract_driver_factory.ChromeFactory;
import by.htp.mail.test_mail.abstract_driver_factory.FirefoxFactory;
import by.htp.mail.test_mail.abstract_driver_factory.WebdriverFactory;

public class DriverFactory {

	static public WebDriver createDriver(String type) {
		WebDriver driver = null;

		if (type.equals("firefox")) {
			AbstractDriver ff = WebdriverFactory.getWebdriver(new FirefoxFactory());
			driver = ff.getWebdriver();

		} else if (type.equals("chrome")) {
			AbstractDriver chr = WebdriverFactory.getWebdriver(new ChromeFactory());
			driver = chr.getWebdriver();

		} else {
			System.out.println("Wrong driver name");
		}

		return driver;
	}

}
