package by.htp.mail.test_mail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

	private final String BASE_URL = "https://mail.ru/";
	
	@FindBy(xpath = ".//input[@id='mailbox:login']")
	private WebElement inputLogin;
	
	@FindBy(xpath = ".//input[@id='mailbox:password']")
	private WebElement inputPass;
	
	@FindBy(xpath = ".//input[@class='o-control'][@type='submit']")
	private WebElement buttonSubmit;
	
	
	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);	
	}
	
	public void doLogin(String login, String pass) {
		inputLogin.sendKeys(login);
		inputPass.sendKeys(pass);
		buttonSubmit.click();
	}

}
