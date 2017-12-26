package by.htp.mail.test_mail.abstract_driver_factory;

import org.openqa.selenium.WebDriver;

import by.htp.mail.test_mail.abstract_driver.AbstractDriver;
import by.htp.mail.test_mail.abstract_driver.ChromeWebdriver;

public class ChromeFactory implements DriverAbstractFactory{
//
//	private WebDriver webdriver;
//
//	public ChromeFactory(WebDriver webdriver) {
//		this.webdriver = webdriver;
//	}

	@Override
	public AbstractDriver createDriver() {
		return new ChromeWebdriver();
	}
	
}
