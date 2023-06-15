package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.platform.suite.api.IncludeTags;
import org.openqa.selenium.WebDriver;

import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Dasbord;
import utils.Util; 

public class DasbordTest {
	
	@Severity(SeverityLevel.CRITICAL)
	//@Test
	@RepeatedIfExceptionsTest(repeats = 2)	
	//@Tag("Regression")
	@DisplayName("VER - 001.1 - Landing Page eleme ellenőrzése")
	// @Disabled()	
	@Order(1)
	@Tag("ZoltanTest")
	void VER_001_1(){
		 Util util = new Util();
		 WebDriver driver = util.start();
		 util.end(0, driver);
	}

}
