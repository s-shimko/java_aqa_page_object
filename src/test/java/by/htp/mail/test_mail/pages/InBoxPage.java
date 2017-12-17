package by.htp.mail.test_mail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InBoxPage extends AbstractPage {

	private final String BASE_URL = "https://mail.ru/messages/inbox/";
	
	@FindBy(xpath = ".//a[@title='Написать письмо (N)']")
	private WebElement buttonWriteLetter;
	
	public InBoxPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);		
	}
	
	public void clickWriteLetter() {
		buttonWriteLetter.click();
	}

	
}
