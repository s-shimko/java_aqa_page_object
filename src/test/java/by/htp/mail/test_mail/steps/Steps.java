package by.htp.mail.test_mail.steps;

import org.openqa.selenium.WebDriver;


import by.htp.mail.test_mail.driver.DriverSingleton;
import by.htp.mail.test_mail.pages.InBoxPage;
import by.htp.mail.test_mail.pages.MainPage;
import by.htp.mail.test_mail.pages.NewMailPage;

public class Steps {
	private WebDriver driver;

	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}
	
	public void closeDriver()
	{
		DriverSingleton.closeDriver();
	}
	
	public void loginMailRu(String username, String password)
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.doLogin(username, password);
	}

	public void startWriteLetter() {
		InBoxPage inBoxPage = new InBoxPage(driver);
		inBoxPage.clickWriteLetter();
	}

	public void sendMail(String sender, String subject, String text) {
		NewMailPage newMail = new NewMailPage(driver);
		newMail.fillForms(sender, subject, text);
		newMail.clickSend();
	}

}
