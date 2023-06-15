package utils;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pages.Dasbord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Util {
	
	
	private static final String Url  = "https://drveresrobert.hu/";
	static final Logger logger = LoggerFactory.getLogger(Util.class.getName());
	
	
	
	public WebDriver start() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Dasbord dasbord = new Dasbord(driver);
		dasbord.clickSutiElfogadsButton();
		
		log(Url + " Meghívásra került!");
		
		return driver;
		
	}
	
	public void log(String szoveg) {
		
		szoveg = "*****"+szoveg+"*****";
		logger.info(szoveg);
		
		
	}

	/** Nulla esetén nem zárja le az oldalt. Minden más értéknél lezárja
	 * 
	 * @param i 0 - brosert bezárja  vagy !0 - browsert NEM zárja be
	 * @param driver
	 */
	public void end(int i, WebDriver driver){
		
		
		
		
		log(Url + " Oldal teszt végetért");
		
		if (i == 0) {
			driver.quit();
			
		}
	}
}
