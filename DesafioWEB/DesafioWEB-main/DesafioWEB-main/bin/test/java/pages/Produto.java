package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Produto extends PageObject {

	WebDriverWait wait = new WebDriverWait(driver, 10);

	
	public Produto(WebDriver driver) {
		super(driver);
	}

	public String lerPreco() {
		return preco.getText();
	}
}
