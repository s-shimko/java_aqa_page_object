package by.htp.mail.test_mail.abstract_driver;

import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {
	
	public abstract WebDriver getWebdriver();
	
	@Override
	public String toString() {
		return "AbstractDriver [getWebdriver()=" + getWebdriver() + "]";
	}
	
	
}
