package by.htp.mail.test_mail.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewMailPage extends AbstractPage {

	private final String BASE_URL = "https://e.mail.ru/compose/";

	private WebDriverWait wait;
	
	@FindBy(xpath = ".//textarea[@data-original-name='To']")
	private WebElement inputTo;

	@FindBy(xpath = "(.//div[@class='b-correspondent__text'])[1]")
	private WebElement foundedRecipientInList;

	@FindBy(xpath = ".//input[@name='Subject']")
	private WebElement inputSubject;

	// @FindBy(xpath = ".//iframe[@title='{#aria.rich_text_area}']")
	// private WebElement inputText;

	@FindBy(xpath = ".//body[@id='tinymce']")
	private WebElement inputText;

	@FindBy(xpath = ".//div[@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_false']//div[@data-title='Отправить (Ctrl+Enter)']")
	private WebElement buttonSend;

	public NewMailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

	public void fillForms(String sender, String subject, String text) {
		inputTo.sendKeys(sender);
		foundedRecipientInList.click();
		inputSubject.sendKeys(subject);

		driver.switchTo().frame(1);
		
		wait = new WebDriverWait(driver, 10);
		WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(inputText));
		searchInput.sendKeys(text);
		
		driver.switchTo().defaultContent();
	}

	public void clickSend() {
		wait = new WebDriverWait(driver, 10);
		WebElement searchButtonSend = wait.until(ExpectedConditions.elementToBeClickable(buttonSend));
		searchButtonSend.click();

		assertTrue(isTextPresent("Ваше письмо отправлено. Перейти во Входящие"));
	}

	protected boolean isTextPresent(String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}
	}

}
