package by.htp.mail.test_mail.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMail extends AbstractPage {

	private final String BASE_URL = "https://e.mail.ru/compose/";

	@FindBy(xpath = ".//textarea[@data-original-name='To']")
	private WebElement inputTo;

	@FindBy(xpath = ".//input[@name='Subject']")
	private WebElement inputSubject;

	@FindBy(id = "tinymce")
	private WebElement inputText;

	@FindBy(xpath = ".//div[@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_false']/div[@data-title='Отправить (Ctrl+Enter)']")
	private WebElement buttonSend;

	public NewMail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

	public void fillForms(String sender, String subject, String text) {
		inputTo.sendKeys(sender);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputSubject.sendKeys(subject);

//		WebElement el = driver.findElement(By.id("tinymce"));
//
//		driver.switchTo().frame(el);
//		el.sendKeys(text);
//		// inputText.click();
//		// inputText.sendKeys(text);
//		driver.switchTo().defaultContent();
		
	    driver.switchTo().frame("tinymce");
	    WebElement body = driver.findElement(By.cssSelector("#tinymce"));
	    body.clear();
	    body.sendKeys("This is a test of the mce editor\n\nDarrell was here!\n");
	}

	public void clickSend() {
		buttonSend.click();
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
