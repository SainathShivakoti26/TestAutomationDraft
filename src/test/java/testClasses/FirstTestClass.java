package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import automationbase.AutomationBase;

public class FirstTestClass extends AutomationBase {

    @Test
    public static void accessTest() {
    	WebElement siteLogo = driver.findElement(By.className("logo"));
    	webDriverWait.until(ExpectedConditions.visibilityOf(siteLogo));
        System.out.println("Page loaded successfully.....");
    }
}
