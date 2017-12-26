package by.htp.mail.test_mail.abstract_driver_factory;

import by.htp.mail.test_mail.abstract_driver.AbstractDriver;

public class WebdriverFactory {
	
	public static AbstractDriver getWebdriver(DriverAbstractFactory factory) {
		return factory.createDriver();
	}
}
