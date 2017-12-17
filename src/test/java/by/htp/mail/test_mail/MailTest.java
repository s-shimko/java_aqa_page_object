package by.htp.mail.test_mail;

import org.testng.annotations.Test;

import by.htp.mail.test_mail.steps.Steps;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MailTest {

	private Steps steps;
//	private final String USERNAME = "tathtp";
//	private final String PASSWORD = "Klopik123";
	private final String USERNAME = "my2m";
	private final String PASSWORD = "brahman222";
	private final String MAIL_SENDER = "sergey1shimko@gmail.com";
	private final String MAIL_SUBJECT = "Selenium test task";
	private final String MAIL_TEXT = "Hello, World!";

	@Test
	public void f() {
		steps.loginMailRu(USERNAME, PASSWORD);
		steps.startWriteLetter();
		steps.sendMail(MAIL_SENDER, MAIL_SUBJECT, MAIL_TEXT);
	}

	@BeforeMethod
	public void beforeMethod() {
		steps = new Steps();
		steps.initBrowser();
	}

	@AfterMethod
	public void afterMethod() {
		steps.closeDriver();
	}

}
