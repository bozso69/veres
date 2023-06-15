package pages;

import java.lang.System.Logger;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Util;

public class Dasbord {
	WebDriver driver;
	Util util = new Util();
	
	@FindBy(id = "cn-accept-cookie")
	WebElement btnSutiElfogadom;	
	
	
	
	public Dasbord(WebDriver driver) {
		super();
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	/**
	 * Rákattint a 'Módosítás' gombra
	 * 
	 **/

	/** "Features Prices Menüpont" - Klikkelés*/ 
	public void clickSutiElfogadsButton() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(btnSutiElfogadom)).click();
	
	}
}
