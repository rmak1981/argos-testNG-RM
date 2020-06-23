package com.argos.pages;

/*
 * Ravi's Creation
 * Date of Creation
 */

import com.argos.utility.UtilityRM;
import org.openqa.selenium.By;

public class HomePage extends UtilityRM {

By accountLink = By.xpath("//span[contains(text(),'Account')]");

public void clickOnAccountLink(){
    clickOnElement(accountLink);
}
}
