package com.argos.testsuite;

import com.argos.loadproperty.LoadProperty;
import com.argos.pages.HomePage;
import com.argos.testbase.TestBase;
import org.testng.annotations.Test;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class LoginTest extends TestBase {

    LoadProperty loadProperty = new LoadProperty();

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldLoginAccountSuccessfully(){

        homePage.clickOnAccountLink();
    }
}
