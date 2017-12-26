package by.htp.mail.test_mail.abstract_driver_factory;

import by.htp.mail.test_mail.abstract_driver.AbstractDriver;
import by.htp.mail.test_mail.abstract_driver.FirefoxWebdriver;

public class FirefoxFactory implements DriverAbstractFactory {
	
	@Override
	public AbstractDriver createDriver() {
		return new FirefoxWebdriver();
	}
	
	

}
